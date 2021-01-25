package com.ming.brain.ctr;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ming.brain.mapperInterface.TestMapper;
import com.ming.brain.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
 
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@ExceptionHandler(Exception.class)
	public void commonException(Exception e) {
		e.printStackTrace();
		logger.debug("Error : ", e);
	}
	
	//���� �ؾ��Ұ� (ȯ�� ����)
	//1.����ó��
	//2.���� ���� ����� and ���� ���̺� �����(��Ű�� �̿��� ����)
	//3.������ ���̽� ����(�켱�� ȸ�� ���̺����) AND ����Ʈ ��ȹ
	//4.Front page �����
	//5.SOLID ��Ģ�� �԰��� �پ��� ������ �д����� �����ؼ� ��ü������ �����ϱ�.
	//6.�Ǽ����� �����ϱ�
	
	@Autowired
	TestMapper test;
	
	@GetMapping("/brainDev/home")
	public String home(Model model, HttpSession session) throws Exception {
		UserVO user = new UserVO();
		user.setUserNM("�̹α�");
		
		model.addAttribute("user", user);
		
		System.out.println(test.selectTest());
		return "/main/home";
	}
	
	@GetMapping("/brainDev/signUp.do")
	public String signUp(Model model, HttpSession session) throws Exception {
		
		return "/user/SignUp";		
	}
}
