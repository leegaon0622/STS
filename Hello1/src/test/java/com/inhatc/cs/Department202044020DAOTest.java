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

public class Department202044020DAOTest {
	@Inject 
	private Department202044020DAO dao ;
		
	@Test
	public void testInsertMember() throws Exception {
		Department202044020VO vo = new Department202044020VO();
		vo.setDeptid("10");
		vo.setDeptname("컴퓨터정보과");
		vo.setCount(100);
		vo.setClassname(1);
		dao.insertDepartment202044020(vo);
	}
	
	@Test
	public void testInsertMember2() throws Exception {
		Department202044020VO vo = new Department202044020VO();
		vo.setDeptid("20");
		vo.setDeptname("항공경영과");
		vo.setCount(300);
		vo.setClassname(2);
		dao.insertDepartment202044020(vo);
	}
	
	@Test
	public void testInsertMember3() throws Exception {
		Department202044020VO vo = new Department202044020VO();
		vo.setDeptid("30");
		vo.setDeptname("화학공학과");
		vo.setCount(500);
		vo.setClassname(3);
		dao.insertDepartment202044020(vo);
	}
}
