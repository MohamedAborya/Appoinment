package com.Project.Ecommerce.exceptions;

import com.Project.Ecommerce.DTO.StatusResponse;

public class ApplicationException extends BaseException{


	/**
	 * 
	 */
	private static final long serialVersionUID = -741215074424755266L;

	public ApplicationException(String code, String message) {
		super(code, message);
	}

	public ApplicationException(StatusResponse status) {
		super(status);
	}
	
}
