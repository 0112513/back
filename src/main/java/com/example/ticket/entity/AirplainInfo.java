package com.example.ticket.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "airplain_info")
public class AirplainInfo {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id //屬性為pk
	
	@Column(name = "airplain_id")
	private int airplainId;
	
	@Column(name = "departure_date")
	private LocalDate departureDate;
	
	@Column(name = "arrival_date")
	private LocalDate arriveDate;
	
	@Column(name = "departure_location")
	private String departureLocation;
	
	@Column(name = "arrival_location")
	private String arrivalLocation;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "class_type")
	private String classType;
	
	@Column(name = "seat")
	private String seat;
	
	@Column(name = "is_oneway")
	private boolean isOneway;

	public AirplainInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AirplainInfo(int airplainId, LocalDate departureDate, LocalDate arriveDate, String departureLocation,
			String arrivalLocation, int price, String classType, String seat, boolean isOneway) {
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
	}
	
	public AirplainInfo(LocalDate departureDate, LocalDate arriveDate, String departureLocation, String arrivalLocation,
			int price, String classType, String seat, boolean isOneway) {
		super();
		this.departureDate = departureDate;
		this.arriveDate = arriveDate;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.price = price;
		this.classType = classType;
		this.seat = seat;
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

	public boolean getIsOneway() {
		return isOneway;
	}

	public void setIsOneway(boolean isOneway) {
		this.isOneway = isOneway;
	}
	
	
}
