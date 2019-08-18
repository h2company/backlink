package com.backlink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.backlink.entities.Account;
import com.backlink.entities.AccountInfo;
import com.backlink.entities.PointMember;
import com.backlink.services.AccountInfoService;
import com.backlink.services.AccountService;
import com.backlink.util.Response;

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

	@PostMapping("account/manager")
	public String updateAccount(ModelMap md, RedirectAttributes red, @RequestParam("id") String idAccountInfo,
			@RequestParam(required = false) String username, @RequestParam(required = false) String fullname,
			@RequestParam(required = false) String address, @RequestParam(required = false) String email,
			@RequestParam(required = false) String phone, @RequestParam("_method") String _method) {
		String redirect = "redirect:/account/manager.html";
		if ("PUT".equals(_method)) {
			try {
				Response response = accountInfoService.update(username, fullname, email, address, phone);
				red.addFlashAttribute("response", response);
				md.addAttribute("aci", (AccountInfo) response.getData());
				redirect += "?id=" + idAccountInfo;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		if ("DELETE".equals(_method)) {
			try {
				red.addFlashAttribute("response", new Response("success", "Xóa tài khoản với ID: " + idAccountInfo + " thành công "));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		return redirect;
	}

}
