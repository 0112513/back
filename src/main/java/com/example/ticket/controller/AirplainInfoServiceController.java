package com.example.ticket.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ticket.ifs.AirplainInfoService;
import com.example.ticket.vo.AirplainInfoGetRes;
import com.example.ticket.vo.AirplainInfoReq;
import com.example.ticket.vo.AirplainInfoRes;
import com.example.ticket.vo.AirplainInfoSearchReq;
import com.example.ticket.vo.DeleteAirplainInfoReq;

@CrossOrigin
@RestController
public class AirplainInfoServiceController {
	
	@Autowired
	private AirplainInfoService airplainInfoService;
	
	@PostMapping(value = "airplainInfo/create")
	public AirplainInfoRes create(@RequestBody AirplainInfoReq req,HttpSession session) {
		return airplainInfoService.create(req.getDepartureDate(), req.getArriveDate(),
				req.getDepartureLocation(),req.getArrivalLocation(),req.getPrice(),req.getClassType(),
				req.getSeat(),req.isOneway(),req.getDA(),req.getAA(),req.getDepatureTerminal(),req.getArriveTerminal(),
				req.getDepatureTime(),req.getArriveTime(),req.getAirplainType());
	}
	
	@PostMapping(value = "airplainInfo/delete")
	public AirplainInfoRes delete(@RequestBody DeleteAirplainInfoReq req) {
		return airplainInfoService.delete(req.getAirplainId());
	}
	
	@PostMapping(value = "airplainInfo/search")
	public AirplainInfoGetRes search(@RequestBody AirplainInfoSearchReq req) {
		return airplainInfoService.search(req.getDepartureDate(),req.getArrivalDate(),req.getDepartureLocation(),req.getArrivalLocation(),req.getClassType(),req.isOneway());	
		
	}
}
