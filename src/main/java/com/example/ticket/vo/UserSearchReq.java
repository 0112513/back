package com.example.ticket.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSearchReq {

	@JsonProperty("account")
	private String account;
	
	@JsonProperty("password")
	private String password;

	public UserSearchReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserSearchReq(String account, String password) {
		super();
		this.account = account;
		this.password = password;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
