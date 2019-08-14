package com.backlink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.backlink.entities.PointMember;
import com.backlink.services.PointMemberService;

@Controller
public class PointController {
	@Autowired
	PointMemberService pointMemberService;

	@ModelAttribute("listPointMember")
	private List<PointMember> getAllPointMembers() {
		return pointMemberService.findAll();
	}

	@GetMapping(value = "point/member")
	public String pointMember(ModelMap md, @RequestParam(required = false) String id) {
		if (id != null) {
			try {
				Integer idMember = Integer.parseInt(id);
				PointMember pm = pointMemberService.findById(idMember);
				md.addAttribute("pm", pm);
			} catch (Exception e) {

			}
		}
		md.addAttribute("active", "pointMember");
		return "point-member";
	}

	@GetMapping(value = "point/log")
	public String pointLog(ModelMap md) {
		md.addAttribute("active", "pointLog");
		return "point-log";
	}
}
