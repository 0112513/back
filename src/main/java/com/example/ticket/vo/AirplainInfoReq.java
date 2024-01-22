package com.example.ticket.vo;

import java.time.LocalDate;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirplainInfoReq {

	@JsonProperty("airplainId")
	private int airplainId;
	
	@JsonProperty("departureDate")
	private LocalDate departureDate;
	
	@JsonProperty("arriveDate")
	private LocalDate arriveDate;
	
	@JsonProperty("departureLocation")
	private String departureLocation;
	
	@JsonProperty("arrivalLocation")
	private String arrivalLocation;
	
	@JsonProperty("price")
	private int price;
	
	@JsonProperty("classType")
	private String classType;
	
	@JsonProperty("seat")
	private String seat;
	
	@JsonProperty("isOneway")
	private boolean isOneway;
	
	@JsonProperty("DA")
	private String DA;
	
	@JsonProperty("AA")
	private String AA;
	
	@JsonProperty("depature_terminal")
	private int depatureTerminal;
	
	@JsonProperty("arrive_terminal")
	private int arriveTerminal;
	
	@JsonProperty("depature_time")
	private String depatureTime;
	
	@JsonProperty("arrive_time")
	private String arriveTime;
	
	@JsonProperty("airplain_type")
	private String airplainType;

	public AirplainInfoReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AirplainInfoReq(int airplainId, LocalDate departureDate, LocalDate arriveDate, String departureLocation,
			String arrivalLocation, int price, String classType, String seat, boolean isOneway, String dA, String aA,
			int depatureTerminal, int arriveTerminal, String depatureTime, String arriveTime, String airplainType) {
		super();
		this.airplainId = airplainId;
		this.departureDate = departureDate;
		this.arriveDate = arriveDate;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.price = price;
		this.classType = classType;
		this.seat = seat;
		this.isOneway = isOneway;
		DA = dA;
		AA = aA;
		this.depatureTerminal = depatureTerminal;
		this.arriveTerminal = arriveTerminal;
		this.depatureTime = depatureTime;
		this.arriveTime = arriveTime;
		this.airplainType = airplainType;
	}

	public int getAirplainId() {
		return airplainId;
	}

	public void setAirplainId(int airplainId) {
		this.airplainId = airplainId;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(LocalDate arriveDate) {
		this.arriveDate = arriveDate;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public boolean isOneway() {
		return isOneway;
	}

	public void setOneway(boolean isOneway) {
		this.isOneway = isOneway;
	}

	public String getDA() {
		return DA;
	}

	public void setDA(String dA) {
		DA = dA;
	}

	public String getAA() {
		return AA;
	}

	public void setAA(String aA) {
		AA = aA;
	}
	
	public int getDepatureTerminal() {
		return depatureTerminal;
	}

	public void setDepatureTerminal(int depatureTerminal) {
		this.depatureTerminal = depatureTerminal;
	}

	public int getArriveTerminal() {
		return arriveTerminal;
	}

	public void setArriveTerminal(int arriveTerminal) {
		this.arriveTerminal = arriveTerminal;
	}

	public String getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getAirplainType() {
		return airplainType;
	}

	public void setAirplainType(String airplainType) {
		this.airplainType = airplainType;
	}
	
}
