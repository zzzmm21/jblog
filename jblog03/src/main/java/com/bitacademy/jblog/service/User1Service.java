package com.bitacademy.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.User1Repository;
import com.bitacademy.jblog.vo.User1Vo;



@Service
public class User1Service {
	@Autowired
	private User1Repository user1Repository;

	public void join(User1Vo user1Vo) {
		user1Repository.insert(user1Vo);
	}

	public User1Vo findUser(User1Vo user1Vo) {
		
		return findUser(user1Vo.getId(), user1Vo.getPassword());

	}
	public User1Vo findUser(String id,String password) {
		return user1Repository.findByIdAndPassword(id,password);
	}

	public User1Vo findUser(Long no) {
			return user1Repository.findByNo(no);
	}


}