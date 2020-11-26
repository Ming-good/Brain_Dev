package com.ming.brain.ctr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ming.brain.mapperInterface.TestMapper;

/**
 * Handles requests for the application home page.
 */
@RestController
public class HomeController {
 
    @Autowired
    private TestMapper test;
    
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/events")
	public String home(Model model) {
		try {
			HashMap map = test.selectTest();
			System.out.println(map.get("NAME"));	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		return "home";
	}
	
}
