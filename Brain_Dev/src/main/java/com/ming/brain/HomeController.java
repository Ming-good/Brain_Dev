package com.ming.brain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController{
 
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	HellowService service;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@GetMapping("/events")
	public String home(Model model) {
        return "Hellow" + service.getName();
	}
	
}
