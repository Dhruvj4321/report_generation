package com.report.generation.entities;

public class LoginResponse {
	
	String message;
	Boolean success;
	
	
	
	public LoginResponse(String message, Boolean success) {
		super();
		this.message = message;
		this.success = success;
		
	}

	public LoginResponse() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	public void setSuccess(boolean success) {
        this.success = success;
    }

	public boolean isSuccess() {
        return success;
    }

	
	
	

}
