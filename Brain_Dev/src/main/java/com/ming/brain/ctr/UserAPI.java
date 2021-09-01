package com.ming.brain.ctr;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fasterxml.jackson.databind.JsonNode;
import com.ming.brain.dao.UserDAO;
import com.ming.brain.source.api.KakaoAPI;

@Controller
@RequestMapping(value="/user/api")
public class UserAPI {
	
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	KakaoAPI kakaoAPI;
	
	@Autowired
	UserDAO user;
	
	@GetMapping("/kakaoLogin")
	public String getKakaoInfo(Model model, HttpSession session,
								@RequestParam("code") String code) throws Exception{
		JsonNode node;
		HashMap map = new HashMap();
		String refresh_token = "";
		
		try {
			node = kakaoAPI.getAccessToken(code, true);
			refresh_token = node.get("refresh_token").toString();
			node = kakaoAPI.getCutomerID(node.get("access_token").toString());
			
			if(node.get("id") == null || "".equals(node.get("id").toString())) {
				throw new Exception("고객 정보가 변조되었습니다.");
			}
			
			map.clear();
			map.put("KAKAO_CUST_ID", node.get("id").toString());
			HashMap userMap = user.selectCustCheck(map);
			
			if(userMap != null && "Y".equals(userMap.get("USER_YN"))) {
				//세션 넣어주고 메인 페이지로 리다이렉트
			} else {
				model.addAttribute("code", refresh_token);
			}
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
		
		return "/user/kakaoLoginForm";
	}
}
