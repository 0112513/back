package com.example.ticket.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "order_by")
public class Order {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id //屬性為pk
	@Column(name = "order_id")
	private int orderId;
	
	@Column(name = "is_oneway")
	private boolean oneway;

	@Column(name = "number_of_people")
	private int numberOfPeople;
	
	@Column(name = "arrival_date")
	private LocalDate arrivalDate;
	
	@Column(name = "departure_date")
	private LocalDate departureDate;
	
	@Column(name = "arrival_location")
	private String arrivalLocation;
	
	@Column(name = "departure_location")
	private String departureLocation;
	
	@Column(name = "class_type")
	private String classType;
	
	@Column(name = "price")
	private int price;

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderId, boolean oneway, int numberOfPeople, LocalDate arrivalDate, LocalDate departureDate,
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
	


	public Order(boolean oneway, int numberOfPeople, LocalDate arrivalDate, LocalDate departureDate,
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
