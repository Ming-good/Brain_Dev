package com.ming.brain.ctr;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpSession;

import org.apache.http.client.ClientProtocolException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.JsonNode;
import com.ming.brain.dao.UserDAO;
import com.ming.brain.source.api.KakaoAPI;
import com.ming.brain.source.util.Util;

@Controller
@RequestMapping(value="/user")
public class User {

	@Autowired
	KakaoAPI kakaoAPI;
	
	@GetMapping("/signUp")
	public String formSignUp(Model model, HttpSession session,
							@RequestParam("ci_code") String code) throws Exception {
		JsonNode node;
		HashMap map = null;
		String path = "";
		
		try {

			if(Util.isSession(session)) {
				return "redirect:/brainDev/home";
			}				
			
			node = kakaoAPI.getAccessToken(code, false);
			node = kakaoAPI.getCutomerID(node.get("access_token").toString());
			
			if(node.get("id") == null || "".equals(node.get("id").toString())) {
				throw new Exception("고객 정보가 변조되었습니다.");
			}
			
			model.addAttribute("ci_code", node.get("id").toString());
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
			throw new Exception("아이디는 영문 + 숫자, 공백이 없는 6자 이상 - 20자 이하로 입력해 주십시오.");
		
		if("".equals(name) || name == null)
			throw new Exception("이름이 비어있습니다.");
		
		if(!passwd2.equals(passwd1)) 
			throw new Exception("패스워드들이 일치하지 않습니다");
			
		
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
