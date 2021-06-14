package com.ming.brain.source.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.util.ObjectUtils;

import com.ming.brain.vo.UserVO;

public class Util {
	/**
	 * Session 여부 체크
	 * @param session
	 * @return
	 */
	public static boolean isSession(HttpSession session) {
		UserVO userSession = (UserVO) session.getAttribute("loginUser");
		
		if(ObjectUtils.isEmpty(userSession)){
			return false;
		} else {
			return true;
		}		
	}
	
	/**
	 * SHA-256 암호화 함
	 * @param source 원본
	 * @param salt(byte[]) SALT 값
	 * @return
	 * @throws NoSuchAlgorithmException 
	 */
	public static String getEncrypt(String source) throws NoSuchAlgorithmException {
	    MessageDigest md = MessageDigest.getInstance("SHA-256");
	    md.update(source.getBytes());
	    StringBuilder builder = new StringBuilder();
	    for (byte b: md.digest()) {
		      builder.append(String.format("%02x", b));
	    }
	    return builder.toString().substring(0, 25);
	}	
}
