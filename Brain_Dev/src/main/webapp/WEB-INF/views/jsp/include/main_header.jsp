<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="java.util.*"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${pageContext.request.contextPath}/design/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/design/js/header.js"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/design/css/header.css">
</head>
<body>
	<header class="head">
		<div class="light_gray">
			<div class="w_size">
				<div class="btn_join">
					<a href="/brain/brainDev/signUp">회원가입</a>
				</div>			
				<div class="btn_join">
					<a href="javascript:Login_pop();">로그인</a>
				</div>
			</div>
		</div>
<!-- 		로그인 -->
		<div class="main_login_pop" style="display:none">
			<form name="login">
				<div class="login_pop">
					<div class="login_pop_wrap">
						<h1><img style="width:170px; height:auto;" src="${pageContext.request.contextPath}/design/img/Brain Dev-logo.png"/></h1>
						<div class="label_box">
							<label for="userid" class="input_login_label">아이디</label>
							<input id="userid" name="userid" type="text" class="input_login">
						</div>
						<div class="label_box">
							<label for="password" class="input_login_label">패스워드</label>
							<input id="password" name="password" type="password" class="input_login">
						</div>	
						<a href="#" class="btn_login">로그인</a>		
					</div>
					<div>
						<a href="javascript://" class="main_login_pop_close">로그인 팝업 닫기</a>
					</div>
				</div>
			</form>
		</div>
		
		<div>
			<div class="head1">
				<div class="logo">
					<a href="#">
						<img style="width:170px; height:auto;" src="${pageContext.request.contextPath}/design/img/Brain Dev-logo.png"/>
					</a>
				</div>
			</div>
			<div class="head2">
				<div class="gnb_wrap">
					<div>
						<ul class="gnb_list2">
							<li><a href="#"><span>IQ 쑥쑥</span></a></li>
							<li><a href="#"><span>순위</span></a></li>
							<li><a href="#"><span>게시판</span></a></li>
						</ul>
					</div>
				</div>
				<div class="gnb2_wrap" style="border-top: 1px solid rgb(238, 238, 238);z-index: 100; height: 300px; padding-top: 0px; margin-top: 0px; padding-bottom: 0px; margin-bottom: 0px; display: none;">
					<ul class="gnb2_list_wrap">
						<li class="gnb2_group group2">
							<ul>
								<li><a href="#"><span>N Back 트레이닝</span></a></li>
								<li><a href="#"><span>DWMT 트레이닝</span></a></li>
							</ul>
						</li>
						<li class="gnb2_group group2">
							<ul>
								<li><a href="#"><span>순위</span></a></li>
							</ul>
						</li>
						<li class="gnb2_group group2">
							<ul>
								<li><a href="#"><span>뇌 쑥쑥 연구소</span></a></li>
								<li><a href="#"><span>자유 게시판</span></a></li>
								<li><a href="#"><span>문의사항</span></a></li>
							</ul>
						</li>						
					</ul>
				</div>
			</div>
		</div>
	</header>

</body>
</html>