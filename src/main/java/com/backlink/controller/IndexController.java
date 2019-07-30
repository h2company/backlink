package com.backlink.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.backlink.entities.Account;
import com.backlink.services.AccountService;

@Controller
public class IndexController {
	
	@Autowired
	private AccountService accountService;
	
	@GetMapping(value = { "", "index" })
	public String viewIndex() {
		return "index";
	}

	@GetMapping(value = "login")
	public String viewLogin() {
		return "login";
	}

	@GetMapping(value = "/register")
	public String viewRegistrator() {
		return "register";
	}

	@PostMapping(value = "/register", produces = "application/json; charset=utf-8")
	public @ResponseBody String actionRegistrator(HttpSession session, @RequestParam("username") String username) {
		return accountService.save(new Account(username, "123", 1, "qa1796@gmail.com", "0377312606")).getHash();
	}

	@GetMapping(value = "forgotpassword")
	public String viewForgotPassword() {
		return "forgotpassword";
	}
}
