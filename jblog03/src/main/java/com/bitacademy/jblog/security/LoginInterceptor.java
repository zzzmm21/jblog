package com.bitacademy.jblog.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.bitacademy.jblog.service.User1Service;
import com.bitacademy.jblog.vo.User1Vo;

public class LoginInterceptor implements HandlerInterceptor {
	@Autowired
	private User1Service user1Service;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		User1Vo authUser = user1Service.findUser(id, password);
		
		if(authUser == null) {
			request.setAttribute("id", id);
			request.getRequestDispatcher("/WEB-INF/views/user1/login.jsp").forward(request, response);
			return false;
		}
		
		System.out.println(authUser);
		
		HttpSession session = request.getSession(true);
		session.setAttribute("authUser", authUser);
		response.sendRedirect(request.getContextPath());
		
		return false;
	}
}