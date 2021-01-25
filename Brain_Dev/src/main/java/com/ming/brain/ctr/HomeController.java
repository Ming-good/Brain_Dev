package com.ming.brain.ctr;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ming.brain.mapperInterface.TestMapper;
import com.ming.brain.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
 
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@ExceptionHandler(Exception.class)
	public void commonException(Exception e) {
		e.printStackTrace();
		logger.debug("Error : ", e);
	}
	
	//내가 해야할것 (환경 구축)
	//1.에러처리
	//2.세션 필터 만들기 and 세션 테이블 만들기(쿠키를 이용한 세션)
	//3.데이터 베이스 설계(우선은 회원 테이블부터) AND 사이트 기획
	//4.Front page 만들기
	//5.SOLID 원칙에 입각한 다양한 디자인 패던들을 적용해서 객체지향적 설계하기.
	//6.실서버에 배포하기
	
	@Autowired
	TestMapper test;
	
	@GetMapping("/brainDev/home")
	public String home(Model model, HttpSession session) throws Exception {
		UserVO user = new UserVO();
		user.setUserNM("이민규");
		
		model.addAttribute("user", user);
		
		System.out.println(test.selectTest());
		return "/main/home";
	}
	
	@GetMapping("/brainDev/signUp.do")
	public String signUp(Model model, HttpSession session) throws Exception {
		
		return "/user/SignUp";		
	}
}
