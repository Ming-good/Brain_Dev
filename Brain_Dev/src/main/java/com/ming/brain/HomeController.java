package com.ming.brain;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;

/**
 * Handles requests for the application home page.
 */
public class HomeController extends HttpServlet {
 
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
        ApplicationContext context = (ApplicationContext) getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        HellowService service = context.getBean(HellowService.class);
        String name = service.getName();
        System.out.println(name);
	}
	
}
