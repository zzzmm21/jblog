package com.bitacademy.jblog.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.User1Vo;


@Repository
public class User1Repository {
	@Autowired
	private SqlSession sqlSession;
	

	public User1Vo findById(Long id) {
		return sqlSession.selectOne("user1.findById", id);
	}
	
	public User1Vo findByIdAndPassword(String id, String password) {
		Map<String, Object> map = new HashMap<>();
		map.put("id", id);
		map.put("password", password);
		return sqlSession.selectOne("user1.findByIdAndPassword", map);
	}
	
	public Boolean insert(User1Vo vo) {
		int count = sqlSession.insert("user1.insert", vo);
		return count == 1;
	}
}