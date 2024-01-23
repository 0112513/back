package com.example.ticket.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ticket.constants.RtnCode;
import com.example.ticket.ifs.OrderService;
import com.example.ticket.vo.DeleteOrderReq;
import com.example.ticket.vo.OrderGetRes;
import com.example.ticket.vo.OrderReq;
import com.example.ticket.vo.OrderRes;
import com.example.ticket.vo.OrderSearchReq;

@CrossOrigin
@RestController
public class OrderServiceController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping(value = "order/create")
	public OrderRes create(@RequestBody OrderReq req,HttpSession session) {
		String attr = (String)session.getAttribute("account");
		if(!StringUtils.hasText(attr)) {
			 return new OrderRes(RtnCode.PLEASE_LOGIN_FIRST.getCode(),RtnCode.PLEASE_LOGIN_FIRST.getMessage());
		 }
		return orderService.create(req.isOneway(),req.getNumberOfPeople(),req.getArrivalDate(),req.getDepartureDate(),req.getArrivalLocation(),
				req.getDepartureLocation(),req.getClassType(),req.getPrice(),req.getAccount());
//		return orderService.create(0,0,req.getArrivalDate(),req.getDepartureDate(),"test",
//				"test","test",false);
	}

	@PostMapping(value = "order/delete")
	public OrderRes delete(@RequestBody DeleteOrderReq req) {
		return orderService.delete(req.getOrderId());		
	}
	
	@PostMapping(value = "order/search")
	public OrderGetRes search(@RequestBody OrderSearchReq req) {
		return orderService.search(req.getDepartureDate(),req.getArrivalDate(),req.getDepartureLocation(),req.getArrivalLocation(),req.getAccount());	
	}
}
