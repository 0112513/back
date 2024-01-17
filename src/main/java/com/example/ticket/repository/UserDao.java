package com.example.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ticket.entity.User;


@Repository
public interface UserDao extends  JpaRepository<User, Integer>{

//	public User findByAccountAndPwd(String account, String pwd); //找資料用find 透過什麼用by 記得要小駝峰
	
//	public boolean existsByAccountAndPwd(String account, String pwd);
	
	public List<User> findByAccount(String account);
	
	public boolean existsByAccount(String account);
	
//	public boolean existByEmail(String email);
//
//	public boolean existByPhone(String phone);

}
