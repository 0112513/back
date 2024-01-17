package com.example.ticket.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteOrderReq {

	@JsonProperty("orderId")
	private int orderId;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

}
