package com.bitacademy.jblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class CategoryController {
	@RequestMapping("/blog")
	public String Category() {
		return "blog/category";
	}
}
