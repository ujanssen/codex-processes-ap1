package de.netzwerk_universitaetsmedizin.codex.processes.data_transfer.validation;

import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.SSLContext;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.glassfish.jersey.SslConfigurator;
import org.glassfish.jersey.client.ClientProperties;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class ValidationPackageClientJersey implements ValidationPackageClient
{
	private final Client client;
	private final String baseUrl;

	public ValidationPackageClientJersey(String baseUrl)
	{
		this(baseUrl, null, null, null, null, null, null, null, null, 0, 0);
	}

	public ValidationPackageClientJersey(String baseUrl, KeyStore trustStore, KeyStore keyStore,
			char[] keyStorePassword, String basicAuthUsername, char[] basicAuthPassword, String proxySchemeHostPort,
			String proxyUsername, char[] proxyPassword, int connectTimeout, int readTimeout)
	{
		SSLContext sslContext = null;
		if (trustStore != null && keyStore == null && keyStorePassword == null)
			sslContext = SslConfigurator.newInstance().trustStore(trustStore).createSSLContext();
		else if (trustStore != null && keyStore != null && keyStorePassword != null)
			sslContext = SslConfigurator.newInstance().trustStore(trustStore).keyStore(keyStore)
					.keyStorePassword(keyStorePassword).createSSLContext();

		ClientBuilder builder = ClientBuilder.newBuilder();

		if (sslContext != null)
			builder = builder.sslContext(sslContext);

		if (basicAuthUsername != null && basicAuthPassword != null)
		{
			HttpAuthenticationFeature basicAuthFeature = HttpAuthenticationFeature.basic(basicAuthUsername,
					String.valueOf(basicAuthPassword));
			builder = builder.register(basicAuthFeature);
		}

		if (proxySchemeHostPort != null)
		{
			builder = builder.property(ClientProperties.PROXY_URI, proxySchemeHostPort);
			if (proxyUsername != null && proxyPassword != null)
				builder = builder.property(ClientProperties.PROXY_USERNAME, proxyUsername)
						.property(ClientProperties.PROXY_PASSWORD, String.valueOf(proxyPassword));
		}

		builder = builder.readTimeout(readTimeout, TimeUnit.MILLISECONDS).connectTimeout(connectTimeout,
				TimeUnit.MILLISECONDS);

		client = builder.build();

		this.baseUrl = baseUrl;
	}

	private WebTarget getResource()
	{
		return client.target(baseUrl);
	}

	@Override
	public ValidationPackage download(ValidationPackageIdentifier identifier)
			throws IOException, WebApplicationException
	{
		Objects.requireNonNull(identifier, "identifier");

		try (InputStream in = getResource().path(identifier.getName()).path(identifier.getVersion())
				.request("application/tar+gzip").get(InputStream.class))
		{
			return ValidationPackage.from(identifier.getName(), identifier.getVersion(), in);
		}
	}
}
