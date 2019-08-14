package com.backlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {
	
	@GetMapping("account/manager")
	public String viewAccountManager(ModelMap md) {
		md.addAttribute("active", "accountManager");
		return "account-list";
	}
}
