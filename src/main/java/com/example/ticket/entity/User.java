package com.example.ticket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user") //資料庫裡面的名字
public class User {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id //屬性為pk
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "account")
	private String account;
	
	@Column(name = "password")
	private String pwd;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "user_name")
	private String name;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "point")
	private int point;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "birthday")
	private String birthday;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int userId, String account, String pwd, String email, String name, String phone, int point, int age,
			String birthday) {
		super();
		this.userId = userId;
		this.account = account;
		this.pwd = pwd;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.point = point;
		this.age = age;
		this.birthday = birthday;
	}
	
	public User(String account, String pwd, String email, String name, String phone, int age, String birthday) {
		super();
		this.account = account;
		this.pwd = pwd;
		this.email = email;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.birthday = birthday;
	}
	
	public User(int userId, String account, String pwd, String email, String name, String phone, int age,
			String birthday) {
		super();
		this.userId = userId;
		this.account = account;
		this.pwd = pwd;
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

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
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
