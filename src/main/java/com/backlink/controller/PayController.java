package com.backlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController {

	@GetMapping("pay/recharge")
	public String addBackLink(ModelMap md) {
		md.addAttribute("active", "payRecharge");
		return "pay-recharge";
	}
	
	@GetMapping("pay/transaction-history")
	public String addAction(ModelMap md) {
		md.addAttribute("active", "payTransactionHistory");
		return "pay-transaction-history";
	}

}
