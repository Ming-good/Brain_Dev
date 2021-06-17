package com.ming.brain.ctr;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/brainDevMain")
public class HomeController {
 
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);

	//내가 해야할것 (환경 구축)
	//1.회원가입 기능, 로그인 기능 만들기
	
	@GetMapping("/home")
	public String home(Model model, HttpSession session) throws Exception {
//		UserVO user = new UserVO();
//		user.setUserNM("이민규");
//		session.setAttribute("loginUser", user);
//		
//		if(Util.isSession(session)) {
//			model.addAttribute("loginUser", user);
//		}
		
		return "/main/home";
	}
}
