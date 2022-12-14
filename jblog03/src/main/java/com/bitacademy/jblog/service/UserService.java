package com.bitacademy.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.UserRepository;
import com.bitacademy.jblog.vo.UserVo;



@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public void join(UserVo userVo) {
		userRepository.insert(userVo);
	}

	public UserVo findUser(UserVo userVo) {
		
		return findUser(userVo.getId(), userVo.getPassword());

	}
	public UserVo findUser(String id,String password) {
		return userRepository.findByIdAndPassword(id,password);
	}

	public UserVo findUser(String id) {
			return userRepository.findById(id);
	}


}