package com.backlink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.backlink.entities.PointLog;
import com.backlink.entities.PointMember;
import com.backlink.services.PointLogService;
import com.backlink.services.PointMemberService;
import com.backlink.util.Response;

@Controller
public class PointController {
	@Autowired
	PointMemberService pointMemberService;
	
	@Autowired
	PointLogService pointLogService;

	@ModelAttribute("listPointMember")
	private List<PointMember> getAllPointsMembers() {
		return pointMemberService.findAll();
	}
	
	@ModelAttribute("listPointLog")
	private List<PointLog> getAllPointsLog() {
		return pointLogService.findAll();
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

	@PostMapping(value = "point/member")
	public String editPointMember(ModelMap md, RedirectAttributes red, @RequestParam("id") String id,
			@RequestParam("_method") String _method, @RequestParam("point") String point) {
		String redirect = "redirect:/point/member.html";
		if ("PUT".equals(_method)) {
			try {
				int idMember = Integer.parseInt(id);
				int pointNumber = Integer.parseInt(point);
				Response response = pointMemberService.update(idMember, pointNumber);
				red.addFlashAttribute("response", response);
				md.addAttribute("pm", (PointMember) response.getData());
				redirect += "?id=" + idMember;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return redirect;
	}

	@GetMapping(value = "point/log")
	public String pointLog(ModelMap md) {
		md.addAttribute("active", "pointLog");
		return "point-log";
	}
}
