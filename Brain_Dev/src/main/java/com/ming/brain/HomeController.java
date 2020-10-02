package com.ming.brain;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
 
	@Autowired
    private SqlSessionFactory sqlFactory;	
    
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping("/events")
	public String home(Model model) {
        SqlSession session = sqlFactory.openSession();
        HashMap map= session.selectOne("com.ming.brain.mapperInterface.selectTest");
        System.out.println(map.get("NAME"));		
		return "home";
	}
	
}