package com.example.ticket.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteAirplainInfoReq {

	@JsonProperty("airplainId")
	private int airplainId;

	public DeleteAirplainInfoReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAirplainId() {
		return airplainId;
	}

	public void setAirplainId(int airplainId) {
		this.airplainId = airplainId;
	}
	
	
}
