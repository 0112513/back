package com.example.ticket.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.ticket.constants.RtnCode;
import com.example.ticket.entity.AirplainInfo;
import com.example.ticket.ifs.AirplainInfoService;
import com.example.ticket.repository.AirplainInfoDao;
import com.example.ticket.vo.AirplainInfoGetRes;
import com.example.ticket.vo.AirplainInfoRes;
@Service
public class AirplainInfoServiceImpl implements AirplainInfoService{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private AirplainInfoDao airplainInfoDao;
	
	@Override
	public AirplainInfoRes create(LocalDate departureDate, LocalDate arriveDate, String departureLocation,
			String arrivalLocation, int price, String classType, int seatNum, boolean isOneway, String DA,
			String AA, int depatureTerminal, int arriveTerminal,  String depatureTime, String arriveTime, String depatureAirport, String arriveAirport, String airplainType ) {
		if(departureDate == null || arriveDate == null || !StringUtils.hasText(departureLocation)
				 || !StringUtils.hasText(arrivalLocation) || price <= 0 ||
				 !StringUtils.hasText(classType) || seatNum <= 0
				 || !StringUtils.hasText(DA) || !StringUtils.hasText(AA) || depatureTerminal <= 0 || arriveTerminal <= 0
				 || !StringUtils.hasText(depatureTime) || !StringUtils.hasText(arriveTime) || !StringUtils.hasText(airplainType)) {
			return new AirplainInfoRes(RtnCode.PARAM_ERROR.getCode(), RtnCode.PARAM_ERROR.getMessage());
		}
		if(departureDate.isAfter(arriveDate)) {
			return new AirplainInfoRes(RtnCode.PARAM_ERROR.getCode(), RtnCode.PARAM_ERROR.getMessage());
		}
		try {
			AirplainInfo item = new AirplainInfo(departureDate,arriveDate,departureLocation,
					arrivalLocation,price,classType,seatNum,isOneway,DA,AA,depatureTerminal,arriveTerminal,depatureTime,arriveTime,depatureAirport,arriveAirport,airplainType);
			airplainInfoDao.save(item);
		} catch (Exception e) {
			return new AirplainInfoRes(RtnCode.ORDER_CREATE_ERROR.getCode(), RtnCode.ORDER_CREATE_ERROR.getMessage());
		}
			return new AirplainInfoRes(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage());
	}

	@Override
	public AirplainInfoRes delete(int airplainId) {
		try {
			airplainInfoDao.deleteById(airplainId);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return new AirplainInfoRes(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage());
	}

	@Override
	public AirplainInfoGetRes search(LocalDate departureDate, LocalDate arriveDate, String departureLocation,
			String arrivalLocation, String classType, boolean isOneway) {
		departureDate = departureDate== null ? LocalDate.of(1970, 01, 01) : departureDate;
		arriveDate = arriveDate == null ? LocalDate.of(2099, 12, 31) : arriveDate;
		arrivalLocation = arrivalLocation== null ? "" : arrivalLocation;
		departureLocation = departureLocation== null ? "" : departureLocation;
		classType = classType== null ? "" : classType;
		List<AirplainInfo> res = new ArrayList<>();
		if(departureDate.isAfter(arriveDate)) {	
			return new AirplainInfoGetRes(RtnCode.DATE_FORMIT_ERROR.getCode(), RtnCode.DATE_FORMIT_ERROR.getMessage(),res);
		}else {
			res = airplainInfoDao.findByLike(departureDate, arriveDate, departureLocation, arrivalLocation, classType);
		}
		return new AirplainInfoGetRes(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage(), res);
	}

	@Override
	public AirplainInfoRes update(int airplainId,LocalDate departureDate, LocalDate arriveDate, String departureLocation,
			String arrivalLocation, int price, String classType, int seatNum, boolean isOneway, String DA, String AA,
			int depatureTerminal, int arriveTerminal, String depatureTime, String arriveTime, 
			String depatureAirport, String arriveAirport,String airplainType) {
		if(departureDate == null || arriveDate == null || !StringUtils.hasText(departureLocation)
				 || !StringUtils.hasText(arrivalLocation) || price <= 0 ||
				 !StringUtils.hasText(classType) || seatNum <= 0
				 || !StringUtils.hasText(DA) || !StringUtils.hasText(AA) || depatureTerminal <= 0 || arriveTerminal <= 0
				 || !StringUtils.hasText(depatureTime) || !StringUtils.hasText(arriveTime) || !StringUtils.hasText(airplainType)) {
			return new AirplainInfoRes(RtnCode.PARAM_ERROR.getCode(), RtnCode.PARAM_ERROR.getMessage());
		}
		 Optional<AirplainInfo> op = airplainInfoDao.findById(airplainId);
		if(op.isEmpty()) {
			return new AirplainInfoRes(RtnCode.AIRPLAININFO_NOT_FOUND.getCode(), RtnCode.AIRPLAININFO_NOT_FOUND.getMessage());
		}
		AirplainInfo airplainInfo = op.get();
		if(departureDate != null) {
			airplainInfo.setDepartureDate(departureDate);
		}
		if(arriveDate != null) {
			airplainInfo.setArriveDate(arriveDate);
		}
		if(StringUtils.hasText(departureLocation)) {
			airplainInfo.setDepartureLocation(departureLocation);
		}
		if(StringUtils.hasText(arrivalLocation)) {
			airplainInfo.setArrivalLocation(arrivalLocation);
		}
		if(StringUtils.hasText(classType)) {
			airplainInfo.setClassType(classType);
		}
		if(StringUtils.hasText(DA)) {
			airplainInfo.setDA(DA);
		}
		if(StringUtils.hasText(AA)) {
			airplainInfo.setAA(AA);
		}
		if(StringUtils.hasText(depatureTime)) {
			airplainInfo.setDepatureTime(depatureTime);
		}
		if(StringUtils.hasText(arriveTime)) {
			airplainInfo.setArriveTime(arriveTime);
		}
		if(StringUtils.hasText(depatureAirport)) {
			airplainInfo.setArriveTime(depatureAirport);
		}
		if(StringUtils.hasText(arriveAirport)) {
			airplainInfo.setArriveTime(arriveAirport);
		}
		if(StringUtils.hasText(airplainType)) {
			airplainInfo.setAirplainType(airplainType);
		}
		airplainInfo.setIsOneway(isOneway);
		try {
			AirplainInfo res = airplainInfoDao.save(new AirplainInfo(airplainId,departureDate,arriveDate,departureLocation,
					arrivalLocation,price,classType,seatNum,isOneway,DA,AA,
					depatureTerminal,arriveTerminal,depatureTime,arriveTime,depatureAirport,arriveAirport,airplainType));
		} catch (Exception e) {
			return new AirplainInfoRes(RtnCode.AIRPLAININFO_UPDATE_ERROR.getCode(), RtnCode.AIRPLAININFO_UPDATE_ERROR.getMessage());
		}
		return new AirplainInfoRes(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage());
	}
}
