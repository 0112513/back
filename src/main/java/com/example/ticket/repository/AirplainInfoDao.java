package com.example.ticket.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ticket.entity.AirplainInfo;

@Repository
public interface AirplainInfoDao extends  JpaRepository<AirplainInfo,Integer>{
	
	public List<AirplainInfo> findByDepartureDateGreaterThanEqualAndArriveDateLessThanEqualAndDepartureLocationContainingAndArrivalLocationContainingAndClassTypeContaining
	(LocalDate departureDate, LocalDate arriveDate, String departureLocation
			, String arrivalLocation, String classType);
}