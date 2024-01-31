//package com.example.ticket.impl;
//
//import org.springframework.mail.SimpleMailMessage;
//
//import com.example.ticket.ifs.MailService;
//
//public class MailServiceImpl implements MailService {
//
//	@Override
//	public void sendEmail(String account, String email) {
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setFrom("jj.huang@hotmail.com");
//		message.setTo("jj.huang@*****.com.tw");
//		message.setSubject("主旨：Hello J.J.Huang");
//		message.setText("內容：這是一封測試信件，恭喜您成功發送了唷");
//
//		mailSender.send(message);
//
//	}
//
//}
