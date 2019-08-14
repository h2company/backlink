package com.backlink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.backlink.entities.Account;
import com.backlink.entities.AccountInfo;
import com.backlink.services.AccountInfoService;
import com.backlink.services.AccountService;

@Controller
public class AccountController {
	@Autowired
	AccountInfoService accountInfoService;

	@ModelAttribute("listAccountInfo")
	private List<AccountInfo> getAllAccount() {
		return accountInfoService.findAll();
	}

	@GetMapping("account/manager")
	public String viewAccountManager(ModelMap md, @RequestParam(required = false) String id) {
		if (id != null) {
			try {
				Integer idAccountInfo = Integer.parseInt(id);
				AccountInfo aci = accountInfoService.findById(idAccountInfo);
				md.addAttribute("aci", aci);
			} catch (Exception e) {

			}
		}
		md.addAttribute("active", "accountManager");
		return "account-list";
	}
}
