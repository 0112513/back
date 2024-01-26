package com.example.ticket.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.ticket.constants.RtnCode;
import com.example.ticket.entity.Order;
import com.example.ticket.ifs.OrderService;
import com.example.ticket.repository.OrderDao;
import com.example.ticket.vo.OrderGetRes;
import com.example.ticket.vo.OrderRes;
@Transactional
@Service
public class OrderServiceImpl implements OrderService {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private OrderDao orderDao;
	
	@Override
	public OrderRes create(boolean oneway,int numberOfPeople, LocalDate arrivalDate, LocalDate departureDate,
			String arrivalLocation, String departureLocation, String classType,int price,String account, String depatureTime, String arriveTime, String addPeople) {
		if(numberOfPeople <= 0 ||  arrivalDate == null || departureDate == null
			||!StringUtils.hasText(arrivalLocation) || !StringUtils.hasText(departureLocation) || !StringUtils.hasText(classType)) {
			return new OrderRes(RtnCode.PARAM_ERROR.getCode(), RtnCode.PARAM_ERROR.getMessage());
		}
		if(departureDate.isAfter(arrivalDate)) {
			return new OrderRes(RtnCode.DATE_FORMIT_ERROR.getCode(), RtnCode.DATE_FORMIT_ERROR.getMessage());
		}
		try {
			Order item = new Order(oneway, numberOfPeople,arrivalDate,departureDate,arrivalLocation,departureLocation,classType,price,account,depatureTime,arriveTime,addPeople);
			orderDao.save(item);
		} catch (Exception e) {
			 return new OrderRes(RtnCode.ORDER_CREATE_ERROR.getCode(), RtnCode.ORDER_CREATE_ERROR.getMessage());
		}
//	    if (orderDao.existsById(orderId)) {
//	        return new OrderRes(RtnCode.ORDER_EXISTED.getCode(), RtnCode.ORDER_EXISTED.getMessage());
//	    }
	    return new OrderRes(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage());
	}
	

	@Override
	public OrderRes delete(int orderId, String account) {
		if(orderId <= 0 || !StringUtils.hasText(account)) {
			return new OrderRes(RtnCode.PARAM_ERROR.getCode(), RtnCode.PARAM_ERROR.getMessage());
		}
		if(!orderDao.existsById(orderId)) {
			return new OrderRes(RtnCode.ORDER_NOT_FOUND.getCode(), RtnCode.ORDER_NOT_FOUND.getMessage());
		}
		if(!orderDao.existsByAccount(account)) {
			return new OrderRes(RtnCode.ACCOUNT_NOT_FOUND.getCode(), RtnCode.ACCOUNT_NOT_FOUND.getMessage());
		}
		try {
			orderDao.deleteByOrderIdAndAccount(orderId, account);
			return new OrderRes(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage());
		} catch (Exception e) {
			logger.error(e.getMessage());
			return new OrderRes(RtnCode.ORDER_DELETE_ERROR.getCode(), RtnCode.ORDER_DELETE_ERROR.getMessage());
		}
		}
		 

	@Override
	public OrderGetRes search(LocalDate departureDate, LocalDate arrivalDate, String departureLocation, String arrivalLocation, String account) {
		arrivalDate = arrivalDate== null ? LocalDate.of(2099, 12, 31) : arrivalDate;
		departureDate = departureDate== null ? LocalDate.of(1970, 01, 01) : departureDate;
		arrivalLocation = arrivalLocation== null ? "" : arrivalLocation;
		departureLocation = departureLocation== null ? "" : departureLocation;
		List<Order> res = new ArrayList<>();
		if(departureDate.isAfter(arrivalDate)) {
			return new OrderGetRes(RtnCode.DATE_FORMIT_ERROR.getCode(), RtnCode.DATE_FORMIT_ERROR.getMessage(),res);
		}else {
			res = orderDao.findByLike(departureDate, arrivalDate, departureLocation, arrivalLocation, account);
		}
		return new OrderGetRes(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage(),res);
	}

	
}
