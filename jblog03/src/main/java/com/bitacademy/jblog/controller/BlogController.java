package com.bitacademy.jblog.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/{id:(?!assets).*}")
public class BlogController {
	@RequestMapping({"", "/{pathNo1}", "/{pathNo1}/{pathNo2}"})
	public String index(
			@PathVariable("id")String id,
			@PathVariable("pathNo1")Optional<Long> pathNo1,
			@PathVariable("pathNo2")Optional<Long> pathNo2){
		Long categoryNo = 0L;
		Long postNo = 0L;
		
		if(pathNo1.isPresent()) {
			categoryNo = pathNo2.get();
		}else if(pathNo1.isPresent()) {
			categoryNo = pathNo1.get();
			postNo = pathNo2.get();
		}
		return"blog/index";
		
	}
	
	@RequestMapping({"/admin","/admin/basic"})
	public String adminBasic(@PathVariable("id")String id) {
		return "blog/admin-basic";
		
	}
	@RequestMapping("/blog")
	public String joinsuccess() {
		return "user1/joinsuccess";
	}
}
