package de.netzwerk_universitaetsmedizin.codex.processes.data_transfer;

import static de.netzwerk_universitaetsmedizin.codex.processes.data_transfer.DataTransferProcessPluginDefinition.VERSION;

public interface ConstantsDataTransfer
{
	String BPMN_EXECUTION_VARIABLE_PATIENT_REFERENCE_LIST = "patientReferenceList";
	String BPMN_EXECUTION_VARIABLE_PATIENT_REFERENCE = "patientReference";
	String BPMN_EXECUTION_VARIABLE_PSEUDONYM = "pseudonym";
	String BPMN_EXECUTION_VARIABLE_STOP_TIMER = "stopTimer";
	String BPMN_EXECUTION_VARIABLE_LAST_EXPORT_TO = "lastExportTo";
	String BPMN_EXECUTION_VARIABLE_EXPORT_FROM = "exportFrom";
	String BPMN_EXECUTION_VARIABLE_EXPORT_FROM_PRECISION = "exportFromPrecision";
	String BPMN_EXECUTION_VARIABLE_EXPORT_TO = "exportTo";
	String BPMN_EXECUTION_VARIABLE_BUNDLE = "bundle";
	String BPMN_EXECUTION_VARIABLE_IDAT_MERGE_GRANTED = "idatMergeGranted";
	String BPMN_EXECUTION_VARIABLE_USAGE_AND_TRANSFER_GRANTED = "usageAndTransferGranted";
	String BPMN_EXECUTION_VARIABLE_BINARY_URL = "binaryUrl";
	String BPMN_EXECUTION_VARIABLE_ERROR_CODE = "errorCode";
	String BPMN_EXECUTION_VARIABLE_ERROR_MESSAGE = "errorMessage";

	String NAMING_SYSTEM_NUM_CODEX_DIC_PSEUDONYM = "http://www.netzwerk-universitaetsmedizin.de/sid/dic-pseudonym";
	String NAMING_SYSTEM_NUM_CODEX_CRR_PSEUDONYM = "http://www.netzwerk-universitaetsmedizin.de/sid/crr-pseudonym";
	String NAMING_SYSTEM_NUM_CODEX_BLOOM_FILTER = "http://www.netzwerk-universitaetsmedizin.de/sid/bloom-filter";

	String IDENTIFIER_NUM_CODEX_DIC_PSEUDONYM_TYPE_SYSTEM = "http://terminology.hl7.org/CodeSystem/v2-0203";
	String IDENTIFIER_NUM_CODEX_DIC_PSEUDONYM_TYPE_CODE = "ANON";

	String RFC_4122_SYSTEM = "urn:ietf:rfc:4122";

	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER = "http://www.netzwerk-universitaetsmedizin.de/fhir/CodeSystem/data-transfer";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_VALUE_PATIENT = "patient";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_VALUE_PSEUDONYM = "pseudonym";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_VALUE_EXPORT_FROM = "export-from";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_VALUE_EXPORT_TO = "export-to";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_VALUE_DATA_REFERENCE = "data-reference";

	String PROFILE_NUM_CODEX_TASK_START_DATA_TRIGGER = "http://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/task-start-data-trigger";
	String PROFILE_NUM_CODEX_TASK_STOP_DATA_TRIGGER = "http://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/task-stop-data-trigger";
	String PROFILE_NUM_CODEX_TASK_DATA_TRIGGER_PROCESS_URI = "http://www.netzwerk-universitaetsmedizin.de/bpe/Process/dataTrigger/";
	String PROFILE_NUM_CODEX_TASK_DATA_TRIGGER_PROCESS_URI_AND_LATEST_VERSION = PROFILE_NUM_CODEX_TASK_DATA_TRIGGER_PROCESS_URI
			+ VERSION;
	String PROFILE_NUM_CODEX_TASK_START_DATA_TRIGGER_MESSAGE_NAME = "startDataTrigger";
	String PROFILE_NUM_CODEX_TASK_STOP_DATA_TRIGGER_MESSAGE_NAME = "stopDataTrigger";

	String PROFILE_NUM_CODEX_TASK_START_DATA_SEND = "http://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/task-start-data-send";
	String PROFILE_NUM_CODEX_TASK_DATA_SEND_PROCESS_URI = "http://www.netzwerk-universitaetsmedizin.de/bpe/Process/dataSend/";
	String PROFILE_NUM_CODEX_TASK_DATA_SEND_PROCESS_URI_AND_LATEST_VERSION = PROFILE_NUM_CODEX_TASK_DATA_SEND_PROCESS_URI
			+ VERSION;
	String PROFILE_NUM_CODEX_TASK_START_DATA_SEND_MESSAGE_NAME = "startDataSend";

	String PROFILE_NUM_CODEX_TASK_START_DATA_TRANSLATE = "http://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/task-start-data-translate";
	String PROFILE_NUM_CODEX_TASK_DATA_TRANSLATE_PROCESS_URI = "http://www.netzwerk-universitaetsmedizin.de/bpe/Process/dataTranslate/";
	String PROFILE_NUM_CODEX_TASK_DATA_TRANSLATE_PROCESS_URI_AND_LATEST_VERSION = PROFILE_NUM_CODEX_TASK_DATA_TRANSLATE_PROCESS_URI
			+ VERSION;
	String PROFILE_NUM_CODEX_TASK_START_DATA_TRANSLATE_MESSAGE_NAME = "startDataTranslate";

	String PROFILE_NUM_CODEX_TASK_START_DATA_RECEIVE = "http://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/task-start-data-receive";
	String PROFILE_NUM_CODEX_TASK_DATA_RECEIVE_PROCESS_URI = "http://www.netzwerk-universitaetsmedizin.de/bpe/Process/dataReceive/";
	String PROFILE_NUM_CODEX_TASK_DATA_RECEIVE_PROCESS_URI_AND_LATEST_VERSION = PROFILE_NUM_CODEX_TASK_DATA_RECEIVE_PROCESS_URI
			+ VERSION;
	String PROFILE_NUM_CODEX_TASK_START_DATA_RECEIVE_MESSAGE_NAME = "startDataReceive";

	String PSEUDONYM_PLACEHOLDER = "${pseudonym}";
	/**
	 * dic-source/dic-pseudonym-original
	 */
	String PSEUDONYM_PATTERN_STRING = "(?<source>[^/]+)/(?<original>[^/]+)";

	String HAPI_USER_DATA_SOURCE_ID_ELEMENT = "source-id";

	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_ERROR = "http://www.netzwerk-universitaetsmedizin.de/fhir/CodeSystem/data-transfer-error";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_ERROR_VALUE_VALIDATION_FAILED = "validation-failed";

	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_ERROR_SOURCE = "http://www.netzwerk-universitaetsmedizin.de/fhir/CodeSystem/data-transfer-error-source";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_ERROR_SOURCE_VALUE_MEDIC = "MeDIC";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_ERROR_SOURCE_VALUE_GTH = "GTH";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_ERROR_SOURCE_VALUE_FTTP = "fTTP";
	String CODESYSTEM_NUM_CODEX_DATA_TRANSFER_ERROR_SOURCE_VALUE_CRR = "CRR";

	String EXTENSION_ERROR_METADATA = "https://www.netzwerk-universitaetsmedizin.de/fhir/StructureDefinition/error-metadata";
	String EXTENSION_ERROR_METADATA_TYPE = "type";
	String EXTENSION_ERROR_METADATA_SOURCE = "source";
	String EXTENSION_ERROR_METADATA_REFERENCE = "reference";
}
