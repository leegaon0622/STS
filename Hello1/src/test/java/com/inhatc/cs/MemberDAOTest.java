package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.MemberVO;
import com.inhatc.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class MemberDAOTest {
	@Inject 
	private MemberDAO dao ;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime()) ;
	}
	
	@Test
	public void testInsertMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("202044020");
		vo.setUserpw("gaonew1214@");
		vo.setUsername("ÀÌ°¡¿Â");
		vo.setEmail("gaon0622@naver.com");
		dao.insertMember(vo);
	}
}
