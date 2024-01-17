package com.example.ticket.vo;

public class AirplainInfoRes {

	private int code;
	
	private String message;

	public AirplainInfoRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AirplainInfoRes(int code, String message) {
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
