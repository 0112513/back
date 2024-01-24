package com.example.ticket.ifs;

import java.time.LocalDate;

import com.example.ticket.vo.OrderGetRes;
import com.example.ticket.vo.OrderRes;

public interface OrderService {

	public OrderRes create(boolean oneway,int numberOfPeople,LocalDate arrivalDate,LocalDate departureDate
			,String arrivalLocation,String departureLocation,String classType,int price,String account,String depatureTime, String arriveTime);
	
	public OrderRes delete(int i);
	
	public OrderGetRes search(LocalDate departureDate,LocalDate arrivalDate,
			String departureLocation,String arrivalLocation, String account);
}
