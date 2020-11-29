<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@page import="java.util.*"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Brain training main page</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="${pageContext.request.contextPath}/design/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/design/js/header.js"></script>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/design/css/slick/slick.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/design/css/slick/slick-theme.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/design/css/header.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/design/css/content.css">
</head>
<body>
<div class="wrap">
	<header class="head">
		<div class="light_gray">
			<div class="w_size">
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
	  <div class="lazy">
	    <div>
	      <a href="#"><img src="http://placehold.it/350x300?text=1-350w" style="width:500px; height:auto;"></a>
	    </div>
	    <div>
	      <a href="#"><img src="http://placehold.it/350x300?text=2-350w" style="width:500px; height:auto;"></a>
	    </div>
	    <div>
	      <a href="#"><img src="http://placehold.it/350x300?text=3-350w" style="width:500px; height:auto;"></a>
	    </div>
	  </div>	
	  
	<div class="container_main">
		<div class="main_section data_wrap">
			<div class="tit_box">
				<h3>트레이닝 안내</h3>
			</div>
			<div class="con_box">
				<div class="go_box">
					<a href="#"><p>N Back 트레이닝</p><strong>트레이닝 바로가기</strong></a>
				</div>			
				<div class="go_box">
					<a href="#"><p>DWMT 트레이닝</p><strong>트레이닝 바로가기</strong></a>
				</div>	
			</div>
		</div>
	</div>
</div>



<script src="${pageContext.request.contextPath}/design/js/slick/slick.min.js" type="text/javascript" charset="utf-8"></script>
  <script type="text/javascript">
  $(document).ready(function() {
		$('.lazy').slick({
			autoplay : true,
			dots : true, /* 하단 점 버튼 */
			speed : 300 /* 이미지가 슬라이딩시 걸리는 시간 */,
			infinite : true,
			autoplaySpeed : 10000 /* 이미지가 다른 이미지로 넘어 갈때의 텀 */,
			arrows : false,
			slidesToShow : 1,
			slidesToScroll : 1,
			touchMove : true, /* 마우스 클릭으로 끌어서 슬라이딩 가능여부 */
// 	  	    prevArrow: false,
// 		    nextArrow: true,
			arrow : true, 
			fade : false
		});
	});
</script>
</body>
</html>
