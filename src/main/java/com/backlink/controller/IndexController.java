package com.backlink.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
public class IndexController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private AccountInfoService accountInfoService;

	@GetMapping(value = { "", "index" })
	public String viewIndex() {
		return "index";
	}

	@GetMapping(value = "login")
	public String viewLogin() {
		return "login";
	}

	@PostMapping(value = "login")
	public String checkLogin(RedirectAttributes red,
			@RequestParam("username") String username, @RequestParam("password") String password) {
		Response response= accountService.authentication(username, password);
		if(!response.isSuccess()) {
			red.addFlashAttribute("response", response);
			red.addFlashAttribute("username", username);
			return "redirect:/login.html";
		}
		return "redirect:/index.html";
	}

	@GetMapping(value = "/register")
	public String viewRegistrator() {
		return "register";
	}

	@PostMapping(value = "/register", produces = "application/json; charset=utf-8")
	public @ResponseBody String actionRegistrator(HttpSession session, @RequestParam("username") String username,
			@RequestParam("fullname") String fullname, @RequestParam("password") String password,
			@RequestParam("repassword") String repassword,@RequestParam("email") String email, 
			@RequestParam("phone") String phone) {
		String result = "Thêm " + username + " thất bại";
		return result;
	}

	@GetMapping(value = "recover-password")
	public String viewForgotPassword() {
		return "recover-password";
	}
}
