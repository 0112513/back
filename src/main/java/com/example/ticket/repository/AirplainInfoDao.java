package com.example.ticket.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.ticket.entity.AirplainInfo;

//@Repository
public interface AirplainInfoDao extends  JpaRepository<AirplainInfo,Integer>{
	
//	public List<AirplainInfo> findByDepartureDateAndArriveDateAndDepartureLocationContainingAndArrivalLocationContainingAndClassTypeContainingAndIsOneway
//	(LocalDate departureDate, LocalDate arriveDate, String departureLocation
//			, String arrivalLocation, String classType, boolean isOneway);
//	
//	public List<AirplainInfo> findByDepartureLocationContainingAndArrivalLocationContaining(String departureLocation
//			, String arrivalLocation);
//	
//	@Query(value="select * from airplain_info where departure_date >= %:departureDate%"
//			+ " AND arrival_date <= %:arrivalDate%"
//			+ " AND departure_location like %:departureLocation%"
//			+ " AND arrival_location like %:arrivalLocation%"
//			+ " AND class_type like %:classType%",nativeQuery = true)
//	public List<AirplainInfo> findByLike(@Param("departureDate") LocalDate departureDate,
//			@Param("arrivalDate") LocalDate arriveDate,@Param("departureLocation") String departureLocation,
//			@Param("arrivalLocation") String arrivalLocation,@Param("classType") String classType);
	
	@Query(value = "SELECT * FROM airplain_info WHERE departure_date >= :departureDate"
	        + " AND arrival_date <= :arrivalDate"
	        + " AND departure_location LIKE %:departureLocation%"
	        + " AND arrival_location LIKE %:arrivalLocation%"
	        + " AND class_type LIKE %:classType%", nativeQuery = true)
	public List<AirplainInfo> findByLike(@Param("departureDate") LocalDate departureDate,
	        @Param("arrivalDate") LocalDate arriveDate, @Param("departureLocation") String departureLocation,
	        @Param("arrivalLocation") String arrivalLocation, @Param("classType") String classType);
}