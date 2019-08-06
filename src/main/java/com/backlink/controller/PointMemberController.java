package com.backlink.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.backlink.entities.AccountInfo;
import com.backlink.entities.PointMember;
import com.backlink.services.AccountService;
import com.backlink.services.PointMemberService;

@Controller
public class PointMemberController {
	@Autowired
	private PointMemberService pointMemberService;
	
	
	@PostMapping(value = "/pointmember", produces = "application/json; charset=utf-8")
	public @ResponseBody String actionRegistrator(HttpSession session, @RequestParam("username") String username,
			 @RequestParam("idlog") int idlog,@RequestParam("point") int point) {
		String result = "Thêm " + username + " thất bại";
		if(pointMemberService.save(new PointMember(username, idlog, point)) != null) {
			result = "Thêm " + username + " thành công";
		}		
		return result;
	}

}
