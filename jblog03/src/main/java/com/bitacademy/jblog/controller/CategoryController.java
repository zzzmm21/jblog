package com.bitacademy.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitacademy.jblog.security.Auth;



@Controller
public class CategoryController {
	@Auth
	@RequestMapping("/admin/category")
	public String adminCategory() {
		return "/blog/blog-admin-category";
	}
	
}
