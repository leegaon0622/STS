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

public class StudentInfoDAOTest {
	@Inject 
	private StudentInfoDAO dao ;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime()) ;
	}
	
	@Test
	public void testInsertStudent() throws Exception {
		StudentVO vo = new StudentVO();
		vo.setStudentid("202044020");
		vo.setStudentname("이가온");
		vo.setAddr("경기 시흥");
		vo.setPhone("010-8384-6247");
		vo.setEmail("gaon0622@naver.com");
		dao.insertStudent(vo);
	}
	
	@Test
	public void testInsertStudent2() throws Exception {
		StudentVO vo = new StudentVO();
		vo.setStudentid("202044021");
		vo.setStudentname("이가온");
		vo.setAddr("경기 시흥");
		vo.setPhone("010-8384-6247");
		vo.setEmail("gaon0622@naver.com");
		dao.insertStudent(vo);
	}
	
	@Test
	public void testInsertStudent3() throws Exception {
		StudentVO vo = new StudentVO();
		vo.setStudentid("202044022");
		vo.setStudentname("이가온");
		vo.setAddr("경기 시흥");
		vo.setPhone("010-8384-6247");
		vo.setEmail("gaon0622@naver.com");
		dao.insertStudent(vo);
	}
}