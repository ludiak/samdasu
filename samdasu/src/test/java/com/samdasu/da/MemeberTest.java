package com.samdasu.da;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.samdasu.da.entity.Member;
import com.samdasu.da.repository.MemberRepository;

@SpringBootTest
public class MemeberTest {
	
	@Autowired
	public MemberRepository memberRepository;
	
	@Test
	public void UserSaveTest() {
		Member member = new Member("test", "1234", "test", "user");
		memberRepository.save(member);
		
		Long seq = (long) 1;
		List<Member> list = memberRepository.findAll();
		Member mem = list.get(0);
		
		System.out.println("member "+mem.getCreateDt());
		System.out.println("member "+mem.getModifyDt());
		
		assertThat(mem.getCreateDt()).isEqualTo(mem.getModifyDt());
	}
}
