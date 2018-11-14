package com.esign.base.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface LoginDao {
	/**
	 * ÑéÖ¤µÇÂ¼ÕË»§
	 */
	Map<String, String> confirmAcc(@Param("userId")String userId, @Param("passwd")String passwd);

}
