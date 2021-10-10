package com.samdasu.da.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.samdasu.da.entity.Member;
import com.samdasu.da.service.MemberService;

@Controller
@RequestMapping(value="member")
public class MemberController {
	@Autowired
	public MemberService memberService;
	
	@RequestMapping(value="")
	public String member(HttpServletRequest request, @ModelAttribute("member") Member member, Model model) {
		model.addAttribute("list", memberService.findAll());
		return "/member/list";
	}
	
	@RequestMapping(value={"/find", "/find/{seq}"})
	public String memberFind(HttpServletRequest request, @ModelAttribute("member") Member member, @PathVariable(required=false) Long seq, Model model) {
		if(!StringUtils.isEmpty(seq)) {
			member = memberService.findBySeq(seq);
		}
		model.addAttribute("member", member);
		return "/member/view";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String memberSave(HttpServletRequest request, @ModelAttribute("member") Member member, Model model) {
		memberService.save(member);
		
		model.addAttribute("list", memberService.findAll());
		return "/member/list";
	}
	
	@RequestMapping(value="/update")
	public String memberUpdate(HttpServletRequest request, @ModelAttribute("member") Member member, Model model) {
		System.out.println("Update");
		return "/member/view";
	}
}
