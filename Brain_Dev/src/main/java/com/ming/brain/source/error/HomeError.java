package com.ming.brain.source.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ming.brain.ctr.HomeController;

@ControllerAdvice
public class HomeError  {
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@ExceptionHandler(Exception.class)
	public String commonException(Model model, Exception e) {
		e.printStackTrace();
		logger.debug("Error : ", e);
		model.addAttribute("ERROR", e);
		return "/error/homeError";
	}
}
