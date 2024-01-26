package com.example.ticket.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeleteOrderReq {

	@JsonProperty("orderId")
	private int orderId;
	
	@JsonProperty("account")
	private String account;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
}
