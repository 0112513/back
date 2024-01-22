package com.example.ticket.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ticket.entity.AirplainInfo;
import com.example.ticket.entity.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
	
//	 public int deleteByOrderIdIn(List<Integer> orderIdList);
//	 
//	 public List<Order> findByArrivalDateLessThanEqualAndDepartureDateGreaterThanEqualAndArrivalLocationContainingAndDepartureLocationContaining
//	 (LocalDate arrivalDate, LocalDate departureDate
//			 ,String arrivalLocation,String departureLocation);
//	 
//	 public List<Order> findByArrivalDateAndDepartureDateAndArrivalLocationAndDepartureLocation
//	 (LocalDate arrivalDate, LocalDate departureDate
//			 ,String arrivalLocation,String departureLocation);
	 
	@Query(value = "SELECT * FROM order_by WHERE arrival_date >= :arrivalDate"
	        + " AND departure_date <= :departureDate"
	        + " AND arrival_location LIKE %:arrivalLocation%"
	        + " AND departure_location LIKE %:departureLocation%"
	        + " OR account LIKE %:account%", nativeQuery = true)
	public List<Order> findByLike(@Param("arrivalDate") LocalDate arrivalDate,
	        @Param("departureDate") LocalDate departureDate, @Param("arrivalLocation") String arrivalLocation,
	        @Param("departureLocation") String departureLocation, @Param("account") String account); 
}
