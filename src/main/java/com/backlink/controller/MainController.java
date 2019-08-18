package com.backlink.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.backlink.entities.Account;
import com.backlink.entities.AccountInfo;
import com.backlink.services.AccountInfoService;
import com.backlink.services.AccountService;
import com.backlink.util.Response;

@Controller
public class MainController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private AccountInfoService accountInfoService;

	@GetMapping(value = { "", "index" })
	public String viewIndex(ModelMap md) {
		md.addAttribute("active", "index");
		return "index";
	}
	
	@GetMapping(value = "login")
	public String viewLogin() {
		return "login";
	}
	
	@GetMapping(value = "logout")
	public String viewLogout(HttpSession session) {
		session.invalidate();
		return "redirect:/login.html";
	}
	

	@PostMapping(value = "login")
	public String checkLogin(HttpSession session, RedirectAttributes red, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		Response response = accountService.authentication(username, password);
		if (!response.isSuccess()) {
			red.addFlashAttribute("response", response);
			red.addFlashAttribute("username", username);
			return "redirect:/login.html";
		}
		session.setAttribute("auth", (Account) response.getData());
		return "redirect:/index.html";
	}

	@GetMapping(value = "/register")
	public String viewRegistrator() {
		return "register";
	}

	@PostMapping(value = "/register", produces = "application/json; charset=utf-8")
	public String actionRegistrator(HttpSession session, RedirectAttributes red,
			@RequestParam("username") String username, @RequestParam("fullname") String fullname,
			@RequestParam("password") String password, @RequestParam("repassword") String repassword,
			@RequestParam("email") String email, @RequestParam("phone") String phone) {
		Account acc = new Account(username, password, 0, email, phone);
		acc.setAccountInfo(new AccountInfo(fullname, acc));
		Response response = accountService.save(acc, repassword);
		red.addFlashAttribute("response", response);
		if (!response.isSuccess()) {
			red.addFlashAttribute("account", acc);
		}
		return "redirect:/register.html";
	}

	@GetMapping(value = "recover-password")
	public String viewForgotPassword() {
		return "recover-password";
	}
}
