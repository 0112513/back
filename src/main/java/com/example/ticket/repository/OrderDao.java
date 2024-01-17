package com.example.ticket.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ticket.entity.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
	
	 public int deleteByOrderIdIn(List<Integer> orderIdList);
	 
	 public List<Order> findByArrivalDateLessThanEqualAndDepartureDateGreaterThanEqualAndArrivalLocationContainingAndDepartureLocationContaining
	 (LocalDate arrivalDate, LocalDate departureDate
			 ,String arrivalLocation,String departureLocation);
	 
	 public List<Order> findByArrivalDateAndDepartureDateAndArrivalLocationAndDepartureLocation
	 (LocalDate arrivalDate, LocalDate departureDate
			 ,String arrivalLocation,String departureLocation);
}
