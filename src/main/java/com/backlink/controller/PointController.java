package com.backlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PointController {
	
	@GetMapping(value = "point/member")
	public String pointMember(ModelMap md) {
		md.addAttribute("active", "pointMember");
		return "pointMember";
	}
	@GetMapping(value = "point/log")
	public String pointLog(ModelMap md) {
		md.addAttribute("active", "pointLog");
		return "pointLog";
	}
}
