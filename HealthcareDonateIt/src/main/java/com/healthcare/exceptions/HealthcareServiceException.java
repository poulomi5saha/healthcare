package com.healthcare.exceptions;

public class HealthcareServiceException extends Exception{

	private static final long serialVersionUID = 1L;

	public HealthcareServiceException() {
		super();
	}

	public HealthcareServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public HealthcareServiceException(String message) {
		super(message);
	}

	public HealthcareServiceException(Throwable cause) {
		super(cause);
	}

}
