package com.backlink.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BacklinkController {
	
	@GetMapping("backlink/add-backlink")
	public String addBackLink(ModelMap md) {
		md.addAttribute("active", "backlinkaddBackLink");
		return "backlink-add-backlink";
	}
	
	@GetMapping("backlink/add-action")
	public String addAction(ModelMap md) {
		md.addAttribute("active", "backlinkaddAction");
		return "backlink-add-action";
	}

	@GetMapping("backlink/statistical-access")
	public String statisticalAccess(ModelMap md) {
		md.addAttribute("active", "backlinkstatisticalAccess");
		return "backlink-statistical-access";
	}
	
}
