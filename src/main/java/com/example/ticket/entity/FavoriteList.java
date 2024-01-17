package com.example.ticket.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "favorite_list")
public class FavoriteList {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id //屬性為pk
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "airplain_id")
	private int airplainId;

	public FavoriteList() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FavoriteList(int userId, int airplainId) {
		super();
		this.userId = userId;
		this.airplainId = airplainId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAirplainId() {
		return airplainId;
	}

	public void setAirplainId(int airplainId) {
		this.airplainId = airplainId;
	}
	
	
}
