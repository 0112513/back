package com.example.ticket.vo;

public class UserLoginInfoRes {

	private int code;
	
	private String message;

	public UserLoginInfoRes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserLoginInfoRes(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
