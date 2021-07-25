package com.ming.brain.ctr;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ming.brain.dao.UserDAO;
import com.ming.brain.mapperInterface.UserMapper;
import com.ming.brain.source.util.Util;

@Controller
@RequestMapping(value="/user")
public class User {

	@GetMapping("/signUp")
	public String formSignUp(Model model, HttpSession session) throws Exception {
		
		if(Util.isSession(session)) {
			return "redirect:/brainDev/home";
		}
		
		return "/user/SignUp";		
	}
	
	@Autowired
	UserDAO userDAO;
	
	@PostMapping("/signUp/insert")
	public String insertSignUp(@RequestParam("loginID") String loginID,
							   @RequestParam("passwd1") String passwd1,
							   @RequestParam("passwd2") String passwd2,
							   @RequestParam("name") String name,
							   Model model, HttpSession session) throws Exception {

		loginID = loginID.toLowerCase().trim();
		Pattern p = Pattern.compile("^([\\w]){6,20}$"); 
		Matcher login_check = p.matcher(loginID);		
		
		if(login_check.matches() == false) 
			throw new Exception("���̵�� ���� + ����, ������ ���� 6�� �̻� - 20�� ���Ϸ� �Է��� �ֽʽÿ�.");
		
		if("".equals(name) || name == null)
			throw new Exception("�̸��� ����ֽ��ϴ�.");
		
		if(!passwd2.equals(passwd1)) 
			throw new Exception("�н�������� ��ġ���� �ʽ��ϴ�");
			
		
		HashMap map = new HashMap();
		map.put("LOGIN_ID", loginID);
		map.put("PASSWORD", Util.getEncrypt(passwd1));
		map.put("CI_CODE", "asdasd");
		map.put("NAME", name);
		
		userDAO.insertUserData(map);
		
		return "redirect:/brainDevMain/home";		
	}	

	@PostMapping("/signUp/update")
	public String updateSignUp(Model model, HttpSession session) throws Exception {
		
		return "/user/home";		
	}	
	
	@PostMapping("/signUp/delete")
	public String deleteSignUp(Model model, HttpSession session) throws Exception {
		
		return "/user/home";		
	}
	
	@ResponseBody
	@GetMapping("/signUp/userChecking")
	public HashMap<String, Object> userCheck(Model model,
							@RequestParam("loginID") String loginID) throws Exception {
		
		Pattern p = Pattern.compile("^([\\w]){6,20}$"); 
		Matcher login_check = p.matcher(loginID);		
		
		if(login_check.matches() == false) {
			HashMap user = new HashMap();
			user.put("USER_YN", "Y");
			return user;
		}
		
		HashMap map = new HashMap();
		map.put("LOGIN_ID", loginID.toLowerCase().trim());		
		HashMap user = userDAO.selectUserData(map);
		return user;
	}
	
	
}
