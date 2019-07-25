package com.backlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class index {
	
	@RequestMapping(value = {"", "index"}, method = RequestMethod.GET)
	public String viewIndex() {
		return "index";
	}
	@RequestMapping(value = {"", "index"}, method = RequestMethod.GET)
	public String viewIndex() {
		return "login";
	}
}
