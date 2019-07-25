package com.backlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	
	@RequestMapping(value = {"", "index"}, method = RequestMethod.GET)
	public String viewIndex() {
		return "index";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String viewLogin() {
		return "login";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String viewRegistrator() {
		return "register";
	}
	
	@RequestMapping(value = "forgotpassword", method = RequestMethod.GET)
	public String viewForgotPassword() {
		return "forgotpassword";
	}
}
