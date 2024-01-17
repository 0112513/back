package com.example.ticket.vo;

import java.util.List;

import com.example.ticket.entity.Order;


public class OrderGetRes extends AirplainInfoRes{

	private List<Order> orderList;

	

	public OrderGetRes(int code, String message ,List<Order> orderList) {
		super(code, message);
		this.orderList = orderList;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	
	
}
