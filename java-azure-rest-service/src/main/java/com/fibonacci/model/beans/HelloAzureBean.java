package com.fibonacci.model.beans;

public class HelloAzureBean {

	private String message;

	protected HelloAzureBean() {

	}

	public HelloAzureBean(String message) {
		this.setMessage(message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
