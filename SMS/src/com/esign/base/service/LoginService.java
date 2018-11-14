package com.esign.base.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esign.base.dao.LoginDao;

@Service
public class LoginService {
	
	@Autowired
	private LoginDao dao;
	/**
	 * ÑéÖ¤µÇÂ¼ÕË»§
	 */
	public Map<String,String> confirmAcc(String userId,String passwd) {
		
		return  dao.confirmAcc( userId, passwd);
	}
}
