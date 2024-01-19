package com.example.ticket.vo;

import java.util.List;

import com.example.ticket.constants.RtnCode;
import com.example.ticket.entity.User;

public class UserLoginRes {

	private RtnCode rtnCode;
	
	public UserLoginRes(RtnCode successful, List<User> res) {
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
