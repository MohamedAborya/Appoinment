package com.Project.Ecommerce.Utils;

import java.util.Base64;

import org.springframework.stereotype.Component;

import com.Project.Ecommerce.Constants.CodesAndKeys;
import com.Project.Ecommerce.DTO.StatusResponse;


@Component
public class Utils {
	public static String generateBasicAutenticationHeader(String userName, String userPassword) {
		byte[] encodedBytes = Base64.getEncoder().encode((userName + ":" + userPassword).getBytes());
		return "Basic " + new String(encodedBytes);
	}

	public static String generateUniqueSequence(String channel) {
		String uniqueSequence = channel + "_" + System.currentTimeMillis() + "." + (int) (Math.random() * 5000);
		return uniqueSequence;
	}

	public static boolean isNotEmpty(Object obj) {
		return obj != null;
	}

	public static Boolean isEmptyString(String str) {
		return str == null || str.equals("");
	}

	public static StatusResponse internalServerError(String message) {

		StatusResponse error = new StatusResponse(CodesAndKeys.INTERNAL_SERVER_ERROR_CODE,
				CodesAndKeys.INTERNAL_SERVER_ERROR_KEY, message);
		return buildErrorMessage(error);
	}

	public static StatusResponse buildErrorMessage(StatusResponse response) {
//		ResourceBundle resourceBundle = ResourceBundle.getBundle("locale.messages",
//				RequestHeadersUtil.getLocaleFromHttpRequest());
//		String message = resourceBundle.getString(response.getKey());
		response.setMessage(response.getMessage());
		return response;
	}

	

}
