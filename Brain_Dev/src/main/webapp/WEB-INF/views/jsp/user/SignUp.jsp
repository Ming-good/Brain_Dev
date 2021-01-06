<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<script src="${pageContext.request.contextPath}/design/js/jquery-3.5.1.min.js"></script>
 	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/design/css/signUp_header.css">
</head>
<body>

<div class="wrap">
	<div class="light_gray">
		<div class="w_size">
			<div class="btn_join">
				<a href="#">메인페이지</a>
			</div>
		</div>
	</div>
	<header class="head">
		<h1>
			<div class="head1">
				<div class="logo">
					<a href="#">
						<img style="width:500px; height:auto;" src="${pageContext.request.contextPath}/design/img/Brain Dev-logo_SignUp.png"/>
					</a>
				</div>
				<em>
					두뇌트레이닝 페이지 <strong>Brain Dev</strong>에 오신 것을 환영합니다. 
				</em>
			</div>
		</h1>
	</header>
	<div class="container">
		<div>
			<h3 class="lineTop">공통 입력사항</h3>
			<table summary="회원가입 공통 입력 사항">
				<caption>회원가입 공통 입력 사항</caption>			
					<tbody>
						<tr>
							<th>아이디<span class="point">*</span></th>
							<td>
								<input type="text" name="userid" class="inputTypeA" maxlength="12" placeholder="아이디"/>
								<a href="#" class="btnM colorD">중복확인</a>
								<span class="subTxt">(4~12 영문, 숫자)</span>
								<input type="hidden" name="userid_check"/>
							</td>
						</tr>
						<tr>
							<th>비밀번호<span class="point">*</span></th>
							<td>
								<input type="password" name="passwd1" class="inputTypeA" maxlength="12" placeholder="비밀번호">
								<div class="subBox">
									<span>(8~12자 영문, 숫자, 특수문자 중 3가지 조합)</span>
								</div>
							</td>
						</tr>
						<tr>
							<th>비밀번호<span class="point">*</span></th>
							<td>
								<input type="password" name="passwd2" class="inputTypeA" maxlength="12" placeholder="비밀번호 확인">
							</td>
						</tr>	
						<tr>
							<th>이름</th>
							<td>
								<ul class="bbsInput">
									<li class="txt">이민규</li>
								</ul>
							</td>
						</tr>					
					</tbody>
			</table>
		</div>		
		
		<div class="btnBox">
			<a href="#" class="btnL colorC">취소하기</a>
			<a href="#" class="btnL colorD">가입완료</a>
		</div>
	</div>
</div>
</body>
</html>