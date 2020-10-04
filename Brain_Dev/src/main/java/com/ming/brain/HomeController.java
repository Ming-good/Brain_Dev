package com.ming.brain;

import java.util.HashMap;

import javax.servlet.http.HttpServlet;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.WebApplicationContext;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController extends HttpServlet {
 
	@Autowired
    private SqlSessionFactory sqlFactory;	
    
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping("/events")
	public String home(Model model) {
        SqlSession session = sqlFactory.openSession();
        HashMap map= session.selectOne("com.ming.brain.mapperInterface.TestMapper.selectTest");
        System.out.println(map.get("NAME"));		
        
        ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        HellowService service = context.getBean(HellowService.class);
        String name = service.getName();
		return "home";
	}
	
}
