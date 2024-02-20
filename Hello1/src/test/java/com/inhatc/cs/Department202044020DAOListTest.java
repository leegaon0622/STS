package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.inhatc.domain.Department202044020VO;
import com.inhatc.persistence.Department202044020DAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
	      locations =  {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})

public class Department202044020DAOListTest {
	@Inject 
	private Department202044020DAO dao ;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime()) ;
	}
	
	@Test
	public void testlistCount() throws Exception {
		System.out.println("데이터 수: " + dao.listCount());
	}
}
