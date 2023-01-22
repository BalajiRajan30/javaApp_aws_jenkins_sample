package com.mac.springproject.exceptionHandling;

public class NullPointerException extends RuntimeException {

	private static final long serialVersionUID = -8910401744633553815L;
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
	public NullPointerException(String errorMessage, String code) {
		super();
		this.errorMessage = errorMessage;
		this.code = code;
	}
	
}
