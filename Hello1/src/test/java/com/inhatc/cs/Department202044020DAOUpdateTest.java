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

public class Department202044020DAOUpdateTest {
	@Inject 
	private Department202044020DAO dao ;
	
	@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime()) ;
	}
	
	@Test
	public void testInsertMember() throws Exception {
		Department202044020VO vo = new Department202044020VO();
		vo.setDeptid("10");
		vo.setDeptname("기계공학과");
		vo.setCount(200);
		vo.setClassname(7);
		dao.update(vo);
	}	
}
