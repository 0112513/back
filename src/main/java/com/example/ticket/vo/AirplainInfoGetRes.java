package com.example.ticket.vo;

import java.util.List;

import com.example.ticket.entity.AirplainInfo;


public class AirplainInfoGetRes extends AirplainInfoRes{

	private List<AirplainInfo> airplainInfoList;

	public AirplainInfoGetRes(int code, String message ,List<AirplainInfo> airplainInfoList) {
		super(code, message);
		this.airplainInfoList = airplainInfoList;
	}

	public List<AirplainInfo> getAirplainInfoList() {
		return airplainInfoList;
	}

	public void setOrderList(List<AirplainInfo> airplainInfoList) {
		this.airplainInfoList = airplainInfoList;
	}
	
	
}
