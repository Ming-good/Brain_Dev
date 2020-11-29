package com.ming.brain.ctr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
 
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/events")
	public String home(Model model) {
		model.addAttribute("name", "이민규");
		logger.debug("로그테스트");
		return "/main/home";
	}
	
}
