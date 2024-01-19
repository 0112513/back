package com.example.ticket.vo;

import java.util.List;

import com.example.ticket.constants.RtnCode;
import com.example.ticket.entity.User;


public class UserLoginGetRes extends UserLoginInfoRes{

	private List<User> userList;
	
	public UserLoginGetRes(int code, String message ,List<User> userList) {
		super(code, message);
		this.userList = userList;
	}

	public UserLoginGetRes(RtnCode accountNotFound) {
		// TODO Auto-generated constructor stub
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
}
