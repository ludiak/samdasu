package com.samdasu.da.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samdasu.da.entity.Member;
import com.samdasu.da.repository.MemberRepository;

@Service
public class MemberService{
	@Autowired
	public MemberRepository memberRepository;
	
	public List<Member> findAll() {
		return memberRepository.findAll();
	}
	
	public Member findBySeq(Long seq) {
		return memberRepository.findBySeq(seq);
	}	
	
	public Member save(Member member) {
		return memberRepository.save(member);
	}

}
