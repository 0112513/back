package com.example.ticket.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserLoginReq {

	@JsonProperty("account")
	private String account;
	
	@JsonProperty("password") //把外部json對應的值做更改 塞到這邊
	private String pwd;
	
	@JsonProperty("emails")
	private String email;
	
	@JsonProperty("user_name")
	private String name;
	
	@JsonProperty("phone")
	private String phone;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
