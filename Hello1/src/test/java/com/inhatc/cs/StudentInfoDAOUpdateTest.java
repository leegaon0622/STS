package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.StudentVO;
import com.inhatc.persistence.StudentInfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class StudentInfoDAOUpdateTest {
	@Inject 
	private StudentInfoDAO dao ;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime()) ;
	}
	
	@Test
	public void testInsertMember() throws Exception {
		StudentVO vo = new StudentVO();
		vo.setStudentid("202044020");
		vo.setStudentname("이인하");
		vo.setAddr("인천");
		vo.setPhone("010-1234-5678");
		vo.setEmail("inha@naver.com");
		dao.update(vo);
	}	
}