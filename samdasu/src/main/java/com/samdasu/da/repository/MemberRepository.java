package com.samdasu.da.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samdasu.da.entity.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>{
	
	public List<Member> findAll();
	
	public Member findBySeq(Long seq);
	public Member getOne(Long seq);
	
	public Member save(Member member);
	
//	public Member deleteBySeq(Long seq);

}
