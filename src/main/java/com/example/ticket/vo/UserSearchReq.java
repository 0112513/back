package com.example.ticket.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserSearchReq {

	@JsonProperty("userId")
	private int userId;
	
	@JsonProperty("account")
	private String account;
	
	@JsonProperty("password")
	private String password;

	@JsonProperty("email")
	private String email;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("phone")
	private String phone;
	
	@JsonProperty("age")
	private int age;
	
	@JsonProperty("birthday")
	private String birthday;
	
	public UserSearchReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserSearchReq(int userId, String account, String password, String email, String name, String phone, int age,
			String birthday) {
		super();
		this.userId = userId;
		this.account = account;
		this.password = password;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.birthday = birthday;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	
}
