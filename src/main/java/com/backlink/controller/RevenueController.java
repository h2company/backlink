package com.backlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RevenueController {
	
	@GetMapping("revenue/advertisement")
	public String addBackLink(ModelMap md) {
		md.addAttribute("active", "revenueAdvertisement");
		return "revenue-advertisement";
	}

	@GetMapping("revenue/exchange")
	public String addAction(ModelMap md) {
		md.addAttribute("active", "revenueExchange");
		return "revenue-exchange";
	}

}
