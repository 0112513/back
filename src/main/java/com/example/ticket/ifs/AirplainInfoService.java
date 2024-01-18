package com.example.ticket.ifs;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.example.ticket.vo.AirplainInfoGetRes;
import com.example.ticket.vo.AirplainInfoRes;

@Service
public interface AirplainInfoService {

	public AirplainInfoRes create(LocalDate departureDate, LocalDate arriveDate, String departureLocation
			, String arrivalLocation, int price, String classType, String seat, boolean isOneway, 
			String DA, String AA, int depatureTerminal, int arriveTerminal, String depatureTime, String arriveTime); 
	
	public AirplainInfoRes delete(int i);
	
	public AirplainInfoGetRes search(LocalDate departureDate, LocalDate arriveDate, String departureLocation
			, String arrivalLocation, String classType, boolean isOneway);
}
