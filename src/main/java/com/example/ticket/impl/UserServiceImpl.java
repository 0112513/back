package com.example.ticket.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.example.ticket.constants.RtnCode;
import com.example.ticket.entity.User;
import com.example.ticket.ifs.UserService;
import com.example.ticket.repository.UserDao;
import com.example.ticket.vo.UserLoginGetRes;
import com.example.ticket.vo.UserLoginRes;

@Service
public class UserServiceImpl implements UserService {

	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

	@Autowired // 叫出Dao2的方法
	private UserDao userDao;

	@Override
	public UserLoginRes login(String account, String pwd) {
		if (!StringUtils.hasText(account) || !StringUtils.hasText(pwd)) {
			return new UserLoginRes(RtnCode.PARAM_ERROR); // 失敗，return到此方法，就跳出去
		}
		List<User> userList = userDao.findByAccount(account);
		User user = new User();
		for (User item : userList) {
			user = item;
		}
		if (user == null) {
			return new UserLoginRes(RtnCode.ACCOUNT_NOT_FOUND);
		}
		if (!encoder.matches(pwd, user.getPwd())) {
			return new UserLoginRes(RtnCode.ACCOUNT_NOT_FOUND);// !res 等同於 res == false //失敗
		}
		if (!userDao.existsByAccount(account)) {
			return new UserLoginRes(RtnCode.ACCOUNT_NOT_EXIST);
		}
		return new UserLoginRes(RtnCode.SUCCESSFUL);
	}

	@Override
	public UserLoginRes create(String account, String pwd, String email, String name, String phone) {
		if (!StringUtils.hasText(account) || !StringUtils.hasText(pwd) || !StringUtils.hasText(email)
				|| !StringUtils.hasText(name) || !StringUtils.hasText(phone)) { // 排除法:帳號或密碼不能為空(沒有內容時)
																				// StringUtils不能為空或空字串
			return new UserLoginRes(RtnCode.PARAM_ERROR); // 失敗，return到此方法，就跳出去
		}
		if (userDao.existsByAccount(account)) {
			return new UserLoginRes(RtnCode.ACCOUNT_EXISTED);
		}
		userDao.save(new User(account, pwd, email, name, phone));
//		userDao.save(new User(account, encoder.encode(pwd),email,name,phone));
		return new UserLoginRes(RtnCode.SUCCESSFUL);
	}

	@Override
	public UserLoginGetRes search(String account, String pwd) {
		// 檢查帳號是否存在
		List<User> res = new ArrayList<>();
		res = userDao.findByAccountAndPwd(account, pwd);
		return new UserLoginGetRes(RtnCode.SUCCESSFUL.getCode(), RtnCode.SUCCESSFUL.getMessage(), res);
	}
//	香如讚讚
}
