package com.tj.springbootudemy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tj.springbootudemy.web.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

	//Spring will inject a bean automatically where it sees Autowired
	@Autowired
	LoginService service;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.put("name", "tj");
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(@RequestParam(value = "name", required = true) String name,
			@RequestParam(value = "password", required = true) String password, ModelMap model) {
		
		boolean isValidUser = service.validateUser(name,  password);
		
		if (!isValidUser) {
			model.put("message", "Incorrect username or password.");
			return "login";
		}
		
		//Write data to the model
		model.put("name", name);
		model.put("password", password);
		model.put("message", "");
		
		return "welcome";
	}

}
