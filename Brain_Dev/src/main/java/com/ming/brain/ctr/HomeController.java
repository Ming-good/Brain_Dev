package com.ming.brain.ctr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import com.ming.brain.mapperInterface.TestMapper;

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
	public String home(Model model) throws Exception {
		
		model.addAttribute("name", "�̹α�");
		System.out.println(test.selectTest());
		return "/main/home";
	}
	
	@GetMapping("/brainDev/signUp")
	public String signUp(Model model) throws Exception {
		
		return "/user/SignUp";		
	}
}
