package com.ming.brain.source.error;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.client.ClientProtocolException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ming.brain.ctr.HomeController;

@ControllerAdvice
public class HomeError  {
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@ExceptionHandler(Exception.class)
	public String commonException(Model model, Exception e) {
		e.printStackTrace();
		logger.debug("Error : ", e);
		model.addAttribute("ERROR", e);
		return "/error/homeError";
	}
	
	@ExceptionHandler(UnsupportedEncodingException.class)
	public String encodingException(Model model, Exception e) {
		e.printStackTrace();
		logger.debug("encoding Error : ", e);
		model.addAttribute("ERROR", e);
		return "/error/homeError";
	}
	
	@ExceptionHandler(ClientProtocolException.class)
	public String protocolException(Model model, Exception e) {
		e.printStackTrace();
		logger.debug("protocol Error : ", e);
		model.addAttribute("ERROR", e);
		return "/error/homeError";
	}
	
	@ExceptionHandler(IOException.class)
	public String inOutException(Model model, Exception e) {
		e.printStackTrace();
		logger.debug("IOE Error : ", e);
		model.addAttribute("ERROR", e);
		return "/error/homeError";
	}		
}
