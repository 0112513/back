package com.example.ticket.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ticket.entity.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
	
	public List<Order> deleteByOrderIdAndAccount(int orderId, String account);
	
	public boolean existsByAccount(String account);
//	 public int deleteByOrderIdIn(List<Integer> orderIdList);
//	 
//	 public List<Order> findByArrivalDateLessThanEqualAndDepartureDateGreaterThanEqualAndArrivalLocationContainingAndDepartureLocationContaining
//	 (LocalDate arrivalDate, LocalDate departureDate
//			 ,String arrivalLocation,String departureLocation);
//	 
//	 public List<Order> findByArrivalDateAndDepartureDateAndArrivalLocationAndDepartureLocation
//	 (LocalDate arrivalDate, LocalDate departureDate
//			 ,String arrivalLocation,String departureLocation);
	 
	@Query(value = "SELECT * FROM order_by WHERE departure_date >= :departureDate"
	        + " AND arrival_date <= :arrivalDate"
	        + " AND departure_location LIKE %:departureLocation%"
	        + " AND arrival_location LIKE %:arrivalLocation%"
	        + " AND account LIKE %:account%", nativeQuery = true)
	public List<Order> findByLike(@Param("departureDate") LocalDate departureDate,
	        @Param("arrivalDate") LocalDate arrivalDate, @Param("departureLocation") String departureLocation,
	        @Param("arrivalLocation") String arrivalLocation, @Param("account") String account); 
	
//	@Query(value = "SELECT * FROM order_by WHERE (departure_date >= :departureDate OR arrival_date <= :arrivalDate)"
//	        + " AND departure_location LIKE %:departureLocation%"
//	        + " AND arrival_location LIKE %:arrivalLocation%"
//	        + " AND account LIKE %:account%", nativeQuery = true)
//	public List<Order> findByLike1(@Param("departureDate") LocalDate departureDate,
//	        @Param("arrivalDate") LocalDate arrivalDate, @Param("departureLocation") String departureLocation,
//	        @Param("arrivalLocation") String arrivalLocation, @Param("account") String account);
}
