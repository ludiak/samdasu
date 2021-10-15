package com.samdasu.da.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	
	@RequestMapping(value= {"/", "/index"})
	public String index(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		System.out.println("durl");
		return "/index";
	}
	
	@RequestMapping(value="login")
	public String login(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		System.out.println("login");
		return "/login";
	}
	
	@RequestMapping(value="admin")
	public String admin(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		System.out.println("admin");
		return "/admin";
	}

	@RequestMapping(value="time")
	@ResponseBody
	public String time(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		return "timetime";
	}

}
