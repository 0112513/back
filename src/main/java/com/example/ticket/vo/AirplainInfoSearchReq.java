package com.example.ticket.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirplainInfoSearchReq {

	@JsonProperty("airplainId")
	private int airplainId;
	
	@JsonProperty("departureDate")
	private LocalDate departureDate;
	
	@JsonProperty("arrivalDate")
	private LocalDate arrivalDate;
	
	@JsonProperty("departureLocation")
	private String departureLocation;
	
	@JsonProperty("arrivalLocation")
	private String arrivalLocation;
	
	@JsonProperty("classType")
	private String classType;
	
	@JsonProperty("isOneway")
	private boolean isOneway;

	public AirplainInfoSearchReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public AirplainInfoSearchReq(LocalDate departureDate, LocalDate arrivalDate, String departureLocation,
			String arrivalLocation, String classType, boolean isOneway) {
		super();
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.classType = classType;
		this.isOneway = isOneway;
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

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
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

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public boolean isOneway() {
		return isOneway;
	}

	public void setOneway(boolean isOneway) {
		this.isOneway = isOneway;
	}
	
}
