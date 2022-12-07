package com.bitacademy.jblog.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitacademy.jblog.service.User1Service;
import com.bitacademy.jblog.vo.User1Vo;


@Controller
@RequestMapping("/user1")
public class User1Controller {
	@Autowired
	private User1Service user1Service;
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String join(@ModelAttribute User1Vo user1Vo) {
		return "user1/join";
	}
	
	@RequestMapping(value="/join", method=RequestMethod.POST)
	public String join(@ModelAttribute @Valid User1Vo user1Vo, BindingResult result, Model model) {
		if(result.hasErrors()) {
//			List<ObjectError> errors = result.getAllErrors();
//			for(ObjectError error : errors) {
//				System.out.println(error);
//			}
			model.addAllAttributes(result.getModel());
			
		//@ModelAttribute 대체가능
		//	model.addAttribute("userVo",userVo); 
			return "user1/join";
		}
		user1Service.join(user1Vo);
		return "redirect:/user1/joinsuccess";
	}

	@RequestMapping("/joinsuccess")
	public String joinsuccess() {
		return "user1/joinsuccess";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "user1/login";
	}



	

}