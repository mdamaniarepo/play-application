package helper;

import com.fasterxml.jackson.databind.node.ObjectNode;

import play.libs.Json;

public class JsonHelper {

	public JsonHelper() {

	}

	public ObjectNode getJsonErrorResponse(String errorMessage) {
		return createJsonNode("error", errorMessage);
	}

	public ObjectNode getJsonSuccessResponse(String successMessage) {
		return createJsonNode("success", successMessage);
	}

	public ObjectNode createJsonNode(String status, String message) {
		ObjectNode response = Json.newObject();
		response.put("status", status);
		response.put("message", message);
		return response;
	}
}
