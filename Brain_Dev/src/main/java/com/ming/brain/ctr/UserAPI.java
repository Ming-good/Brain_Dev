package com.ming.brain.ctr;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/user/api")
public class UserAPI {
	
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/kakaoLogin")
	public String getKakaoInfo(Model model, HttpSession session,
								@RequestParam("code") String code) {
		model.addAttribute("ciCode", code);
		return "/user/kakaoLoginForm";
	}
}
