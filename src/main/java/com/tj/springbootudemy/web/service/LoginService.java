package com.tj.springbootudemy.web.service;

import org.springframework.stereotype.Component;

//Spring Bean
@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		//For the purposes of this exercise:
			//Expect tj, abc
		String expectedID = "tj";
		String expectedPassword = "abc";
		return userid.equalsIgnoreCase(expectedID) && password.equals(expectedPassword);
	}
	
	
}
