package com.example.ticket.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderReq {

	@JsonProperty("orderId")
	private int orderId;
	
	@JsonProperty("oneway")
	private boolean oneway;
	
	@JsonProperty("numberOfPeople")
	private int numberOfPeople;

	@JsonProperty("arrivalDate")
	private LocalDate arrivalDate;
	
	@JsonProperty("departureDate")
	private LocalDate departureDate;
	
	@JsonProperty("arrivalLocation")
	private String arrivalLocation;
	
	@JsonProperty("departureLocation")
	private String departureLocation;
	
	@JsonProperty("classType")
	private String classType;
	
	@JsonProperty("price")
	private int price;
	
	public OrderReq(int orderId, boolean oneway, int numberOfPeople, LocalDate arrivalDate, LocalDate departureDate,
			String arrivalLocation, String departureLocation, String classType, int price) {
		super();
		this.orderId = orderId;
		this.oneway = oneway;
		this.numberOfPeople = numberOfPeople;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.arrivalLocation = arrivalLocation;
		this.departureLocation = departureLocation;
		this.classType = classType;
		this.price = price;
	}
	
	public OrderReq(boolean oneway, int numberOfPeople, LocalDate arrivalDate, LocalDate departureDate,
			String arrivalLocation, String departureLocation, String classType, int price) {
		super();
		this.oneway = oneway;
		this.numberOfPeople = numberOfPeople;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.arrivalLocation = arrivalLocation;
		this.departureLocation = departureLocation;
		this.classType = classType;
		this.price = price;
	}

	public OrderReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public boolean isOneway() {
		return oneway;
	}

	public void setOneway(boolean oneway) {
		this.oneway = oneway;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalLocation() {
		return arrivalLocation;
	}

	public void setArrivalLocation(String arrivalLocation) {
		this.arrivalLocation = arrivalLocation;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
