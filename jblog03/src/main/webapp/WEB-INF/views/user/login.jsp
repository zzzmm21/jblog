<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JBlog</title>
<Link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/jblog.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery/jquery-1.9.0.js"></script>
</head>
<body>
	<div class="center-content">
		<h1 class="logo">JBlog</h1>
			<c:import url="/WEB-INF/views/includes/header.jsp" />
		<form id="login-form" name="loginform" method="post" action="${pageContext.request.contextPath }/user/auth">
      		<label>아이디</label> <input name="id" type="text" value="">
      		<label>패스워드</label> <input name="password" type="password" value="">
      		<input type="submit" value="로그인">
		</form>
	</div>
</body>
</html>
