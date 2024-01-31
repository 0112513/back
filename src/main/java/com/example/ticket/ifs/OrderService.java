package com.example.ticket.ifs;

import java.time.LocalDate;

import javax.transaction.Transactional;

import com.example.ticket.vo.OrderGetRes;
import com.example.ticket.vo.OrderRes;

@Transactional
public interface OrderService {

	public OrderRes create(boolean oneway,int numberOfPeople,LocalDate arrivalDate,LocalDate departureDate
			,String arrivalLocation,String departureLocation,String classType,int price
			,String account,String depatureTime, String arriveTime, String addPeople,String seat);
	
	
	public OrderRes delete(int i, String account);
	
	public OrderGetRes search(LocalDate departureDate,LocalDate arrivalDate,
			String departureLocation,String arrivalLocation, String account);
}
