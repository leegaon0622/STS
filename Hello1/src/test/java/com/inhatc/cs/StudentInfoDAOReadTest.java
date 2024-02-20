package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.persistence.StudentInfoDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class StudentInfoDAOReadTest {
	@Inject 
	private StudentInfoDAO dao ;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime()) ;
	}
	
	@Test
	   public void readStudent() throws Exception {
	      System.out.println(dao.readStudent("202044020")) ;
	   }
}