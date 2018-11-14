package com.esign.base.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.esign.base.service.LoginService;
@Controller
public class Login {
	@Autowired
	private LoginService service;
	/**
	 * µÇÂ¼Ò³Ãæ
	 * @return
	 */
	@RequestMapping("toLogin")
	public String toLogin() {
		
		return "base/toLogin";
	}
	/**
	 * µÇÂ¼
	 * @param userId
	 * @param passwd
	 * @return
	 */
	@RequestMapping("login")
	public String login(String userId,String passwd,HttpServletRequest req) {
		
		Map<String,String> userInfo = service.confirmAcc(userId, passwd);
		
		if(userInfo!=null) {
			req.setAttribute("userInfo",userInfo);
			return "base/index";
					
		} else {
			return "base/error";
		}
	}
	
	
}
