package com.example.ticket.constants;

	public enum RtnCode {
	
	SUCCESSFUL(200,"Successful!!!"),//
	PARAM_ERROR(400,"Param error!!"),//
	ACCOUNT_NOT_FOUND(404,"Account not found!!!!"),
	ACCOUNT_NOT_EXIST(404,"Account not exist!!!!"),
	DATE_FORMIT_ERROR(400,"Date format is error!!!"),
	ACCOUNT_EXISTED(400,"Account existed"),
	EMAIL_EXISTED(400,"Email existed!!!!"),
	PHONE_EXISTED(400,"Phone existed!!!!"),
	ORDER_CREATE_ERROR(400,"Order create error!!"),//
	AIRPLAININFO_NOT_FOUND(404,"AirplainInfo not found!!!!"),
	QUIZ_CANNOT_BE_UPDATED(400,"Quiz cnanot be update!!"),
	QUIZ_ID_LIST_IS_EMPTY(400,"Quiz id list is empty!!"),
	QUESTION_DRLETE_ERROR(400,"Question delete error!!"),
	ORDER_IS_NOT_EXIST(400,"Order is not exist!!!"),
	STRING_PARSER_ERROR(400,"String parser"),
	PLEASE_LOGIN_FIRST(400,"Please login first!!!!"),
	AIRPLAININFO_UPDATE_ERROR(400,"AirplainInfo update error!!"),
	ORDER_EXISTED(400,"Order existed!!!!");

	private int code;

	private String message;

	private RtnCode(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

}
