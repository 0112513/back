package com.example.ticket.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ticket.constants.RtnCode;
import com.example.ticket.ifs.UserService;
import com.example.ticket.vo.UserLoginGetRes;
import com.example.ticket.vo.UserLoginReq;
import com.example.ticket.vo.UserLoginRes;
import com.example.ticket.vo.UserSearchReq;

@CrossOrigin
@RestController
public class UserServiceController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "api/login")
	public UserLoginRes login(@RequestBody UserLoginReq req, HttpSession session) {
		String attr = (String) session.getAttribute("account");
		if (StringUtils.hasText(attr) && attr.equals(req.getAccount())) {
			return new UserLoginRes(RtnCode.SUCCESSFUL);
		}
		UserLoginRes res = userService.login(req.getAccount(), req.getPwd());
		if (res.getRtnCode().getCode() == 200) {
			session.setAttribute("account", req.getAccount());
			// 設置session 有效時間 單位為秒
			// 若不設定 預設時間為30分鐘
			session.setMaxInactiveInterval(3000000);
		}
		return res;
	}
	
	@GetMapping(value = "api/logout")
	public UserLoginRes logout(HttpSession session) {
		//讓session失效
		session.invalidate();
		return new UserLoginRes(RtnCode.SUCCESSFUL);
	}
	
	@PostMapping(value = "user/create")
	public UserLoginRes create(@RequestBody UserLoginReq req) {
		UserLoginRes res = userService.create(req.getAccount(), req.getPwd(), req.getEmail(), req.getName(), req.getPhone(),req.getAge(),req.getBirthday());
		return res;	
	}
	
	@PostMapping(value = "user/search")
	public UserLoginGetRes search(@RequestBody UserSearchReq req) {
		return userService.search(req.getAccount(),req.getPassword());	
	}
	
	@PostMapping(value = "user/update")
	public UserLoginRes update(@RequestBody UserSearchReq req) {
		return userService.update(req.getUserId(),req.getAccount(),req.getPassword(), 
				req.getEmail(), req.getName(), req.getPhone(),req.getAge(),req.getBirthday());	
	}
	
}
