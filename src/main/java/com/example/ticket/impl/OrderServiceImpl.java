package com.example.ticket.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.ticket.constants.RtnCode;
import com.example.ticket.entity.Order;
import com.example.ticket.ifs.MailService;
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
	
    private MailService mailService; // 注入邮件服务

	private JavaMailSender mailSender;
	
	@Autowired
	public OrderServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
	
	@Override
	public OrderRes create(boolean oneway,int numberOfPeople, LocalDate arrivalDate, LocalDate departureDate,
			String arrivalLocation, String departureLocation,
			String classType,int price,String account, String depatureTime,
			String arriveTime, String addPeople, String seat) {
		if(numberOfPeople <= 0 ||  arrivalDate == null || departureDate == null
			||!StringUtils.hasText(arrivalLocation) || !StringUtils.hasText(departureLocation) || !StringUtils.hasText(classType)
			 ||  price <= 0 || !StringUtils.hasText(account) ||!StringUtils.hasText(depatureTime) || !StringUtils.hasText(arriveTime)
			 || !StringUtils.hasText(addPeople) || !StringUtils.hasText(seat)) {
			return new OrderRes(RtnCode.PARAM_ERROR.getCode(), RtnCode.PARAM_ERROR.getMessage());
		}
		if(departureDate.isAfter(arrivalDate)) {
			return new OrderRes(RtnCode.DATE_FORMIT_ERROR.getCode(), RtnCode.DATE_FORMIT_ERROR.getMessage());
		}
		try {
			Order item = new Order(oneway, numberOfPeople,arrivalDate,departureDate,arrivalLocation,
					departureLocation,classType,price,account,depatureTime,arriveTime,addPeople,seat);
			orderDao.save(item);
		} catch (Exception e) {
			 return new OrderRes(RtnCode.ORDER_CREATE_ERROR.getCode(), RtnCode.ORDER_CREATE_ERROR.getMessage());
		}
//	       SimpleMailMessage message = new SimpleMailMessage();
//	        message.setFrom("happygoairplain@gmail.com");
//	        message.setTo(email);
//	        message.setSubject("有一則來自樂購航空的通知");
//	        message.setText("你已經成功註冊，歡迎加入樂購航空！！！");
//
//	        mailSender.send(message);
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
