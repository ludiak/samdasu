package com.samdasu.da.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samdasu.da.entity.Member;
import com.samdasu.da.repository.MemberRepository;

@Service
public class MemberService{
	@Autowired
	public MemberRepository memberRepository;
	
	@Transactional
	public List<Member> findAll() {
		return memberRepository.findAll();
	}
	
	@Transactional
	public Member findBySeq(Long seq) {
		return memberRepository.findBySeq(seq);
	}
	
	@Transactional
	public Member getOne(Long seq) {
		return memberRepository.getOne(seq);
	}
	
	@Transactional
	public Member save(Member member) {
		return memberRepository.save(member);
	}
}
