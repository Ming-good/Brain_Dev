package com.ming.brain.rootConfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionIntercepter implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
//		HttpSession session = request.getSession();
//		UserVO userSession = (UserVO) session.getAttribute("loginUser");
//		
//		System.out.println("\n\n\n\n\n\n\n¼¼¼Ç\n\n\n\n\n\n\n\n\n\n\n");
//		response.sendRedirect("/brainDev/signUp");
//		if(ObjectUtils.isEmpty(userSession)){
//			
//			return false;
//		} else {
//			return true;
//		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("postHandler1");
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("afterHandler1");
		
	}

}
