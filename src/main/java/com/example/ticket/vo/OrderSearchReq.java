package com.example.ticket.vo;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OrderSearchReq {

	@JsonProperty("orderId")
	private int orderId;
	
	@JsonProperty("arrivalDate")
	private LocalDate arrivalDate;
	
	@JsonProperty("departureDate")
	private LocalDate departureDate;
	
	@JsonProperty("arrivalLocation")
	private String arrivalLocation;
	
	@JsonProperty("departureLocation")
	private String departureLocation;
	

	public OrderSearchReq(int orderId, LocalDate arrivalDate, LocalDate departureDate, String arrivalLocation,
			String departureLocation) {
		super();
		this.orderId = orderId;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.arrivalLocation = arrivalLocation;
		this.departureLocation = departureLocation;
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
		
}
