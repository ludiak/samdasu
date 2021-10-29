package com.samdasu.da.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.samdasu.da.entity.Member;
import com.samdasu.da.service.MemberService;

@Controller
@RequestMapping(value="login")
public class LoginController {
	@Autowired
	public MemberService memberService;
	
	@RequestMapping(value="")
	public String login(HttpServletRequest request, @ModelAttribute("member") Member member, Model model) {
		return "/login";
	}
}
