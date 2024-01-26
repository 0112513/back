package com.example.ticket.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderSearchReq {

	@JsonProperty("orderId")
	private int orderId;
	
	@JsonProperty("arrival_date")
	private LocalDate arrivalDate;
	
	@JsonProperty("departure_date")
	private LocalDate departureDate;
	
	@JsonProperty("arrival_location")
	private String arrivalLocation;
	
	@JsonProperty("departure_location")
	private String departureLocation;
	
	@JsonProperty("account")
	private String account;
	
	public OrderSearchReq(int orderId, LocalDate arrivalDate, LocalDate departureDate, String arrivalLocation,
			String departureLocation, String account) {
		super();
		this.orderId = orderId;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.arrivalLocation = arrivalLocation;
		this.departureLocation = departureLocation;
		this.account = account;
	}

	public OrderSearchReq() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
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

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
}
