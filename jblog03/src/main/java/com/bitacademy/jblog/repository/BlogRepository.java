package com.bitacademy.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.BlogVo;



@Repository
public class BlogRepository {
	private SqlSession sqlSession;
	
	public int insert(BlogVo blogVo) {
		return sqlSession.insert("blog.insert", blogVo);
	}

	public List<Object> findById(String id) {
		return sqlSession.selectList("blog.finByID");
	}

	public int update(BlogVo blogvo) {
			return sqlSession.update("blog.update", blogvo);
	}
		

}
