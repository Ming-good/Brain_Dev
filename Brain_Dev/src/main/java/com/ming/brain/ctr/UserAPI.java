package com.ming.brain.ctr;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

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
import com.ming.brain.source.api.KakaoAPI;

@Controller
@RequestMapping(value="/user/api")
public class UserAPI {
	
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	KakaoAPI kakaoAPI;
	
	@GetMapping("/kakaoLogin")
	public String getKakaoInfo(Model model, HttpSession session,
								@RequestParam("code") String code) {
		JsonNode node;
		
		try {
			node = kakaoAPI.getAccessToken(code);
			model.addAttribute("ciCode", node);
			logger.debug("test kakao token ===> " + node);
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
