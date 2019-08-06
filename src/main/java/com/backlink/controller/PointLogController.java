package com.backlink.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.backlink.entities.PointLog;
import com.backlink.services.PointLogService;

@Controller
public class PointLogController {
	@Autowired
	private PointLogService pointLogService;
	
	@PostMapping(value = "/PointLog", produces = "application/json; charset=utf-8")
	public @ResponseBody String actionRegistrator(HttpSession session, @RequestParam("des") String des) {
		String result = "Thêm " + des + " thất bại";
		if(pointLogService.save(new PointLog(des)) != null) {
			result = "Thêm " + des + " thành công";
		}		
		return result;
	}
}
