package com.example.ticket.vo;

import com.example.ticket.constants.RtnCode;

public class UserLoginRes {

	private RtnCode rtnCode;
	
	

	public UserLoginRes() {
		super();
	}

	public UserLoginRes(RtnCode rtnCode) {
		super();
		this.rtnCode = rtnCode;
	}

	public RtnCode getRtnCode() {
		return rtnCode;
	}

	public void setRtnCode(RtnCode rtnCode) {
		this.rtnCode = rtnCode;
	}
}
