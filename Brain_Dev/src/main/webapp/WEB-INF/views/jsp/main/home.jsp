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
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/design/css/content.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/design/css/slick/slick.css">
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/design/css/slick/slick-theme.css">
</head>
<body>
<div class="wrap">
	<c:import url="../include/main_header.jsp"></c:import>  
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
