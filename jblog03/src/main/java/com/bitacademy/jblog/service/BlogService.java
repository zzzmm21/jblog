package com.bitacademy.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.BlogRepository;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.PostVo;

@Service
public class BlogService {
	@Autowired
	private BlogRepository blogRepository;

//	public void insertBlog(BlogVo vo) {
//		blogRepository.insertBlog(vo);
//	}
//
	public void update(BlogVo vo) {
		blogRepository.update(vo);
	}

	public Object findCategoryNoAndName(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void write(PostVo postVo) {
		// TODO Auto-generated method stub
		
	}



	

}
