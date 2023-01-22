package com.mac.springproject.exceptionHandling;

public class ApiInternalServerException extends RuntimeException {

	private static final long serialVersionUID = -7306692802261488495L;
	
	String errorMessage;
	String code;
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public ApiInternalServerException(String errorMessage, String code) {
		super();
		this.errorMessage = errorMessage;
		this.code = code;
	}
	
}
