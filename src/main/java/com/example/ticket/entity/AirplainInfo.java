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
	
	@Column(name = "seat_num")
	private int seatNum;
	
	@Column(name = "is_oneway")
	private boolean isOneway;
	
	@Column(name = "DA")
	private String DA;
	
	@Column(name = "AA")
	private String AA;
	
	@Column(name = "depature_terminal")
	private int depatureTerminal;
	
	@Column(name = "arrive_terminal")
	private int arriveTerminal;
	
	@Column(name = "depature_time")
	private String depatureTime;
	
	@Column(name = "arrive_time")
	private String arriveTime;
	
	@Column(name = "depature_airport")
	private String depatureAirport;
	
	@Column(name = "arrive_airport")
	private String arriveAirport;
	
	@Column(name = "airplain_type")
	private String airplainType;

	public AirplainInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AirplainInfo(int airplainId, LocalDate departureDate, LocalDate arriveDate, String departureLocation,
			String arrivalLocation, int price, String classType, int seatNum, boolean isOneway, String dA, String aA,
			int depatureTerminal, int arriveTerminal, String depatureTime, String arriveTime, String depatureAirport,
			String arriveAirport, String airplainType) {
		super();
		this.airplainId = airplainId;
		this.departureDate = departureDate;
		this.arriveDate = arriveDate;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.price = price;
		this.classType = classType;
		this.seatNum = seatNum;
		this.isOneway = isOneway;
		DA = dA;
		AA = aA;
		this.depatureTerminal = depatureTerminal;
		this.arriveTerminal = arriveTerminal;
		this.depatureTime = depatureTime;
		this.arriveTime = arriveTime;
		this.depatureAirport = depatureAirport;
		this.arriveAirport = arriveAirport;
		this.airplainType = airplainType;
	}
	
	public AirplainInfo(LocalDate departureDate, LocalDate arriveDate, String departureLocation, String arrivalLocation,
			int price, String classType, int seatNum, boolean isOneway, String dA, String aA, int depatureTerminal,
			int arriveTerminal, String depatureTime, String arriveTime, String depatureAirport, String arriveAirport,
			String airplainType) {
		super();
		this.departureDate = departureDate;
		this.arriveDate = arriveDate;
		this.departureLocation = departureLocation;
		this.arrivalLocation = arrivalLocation;
		this.price = price;
		this.classType = classType;
		this.seatNum = seatNum;
		this.isOneway = isOneway;
		DA = dA;
		AA = aA;
		this.depatureTerminal = depatureTerminal;
		this.arriveTerminal = arriveTerminal;
		this.depatureTime = depatureTime;
		this.arriveTime = arriveTime;
		this.depatureAirport = depatureAirport;
		this.arriveAirport = arriveAirport;
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
	
	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	public boolean getIsOneway() {
		return isOneway;
	}

	public void setIsOneway(boolean isOneway) {
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

	public String getDepatureAirport() {
		return depatureAirport;
	}

	public void setDepatureAirport(String depatureAirport) {
		this.depatureAirport = depatureAirport;
	}

	public String getArriveAirport() {
		return arriveAirport;
	}

	public void setArriveAirport(String arriveAirport) {
		this.arriveAirport = arriveAirport;
	}
	
}
