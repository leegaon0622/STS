package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.Department202044020VO;

public interface Department202044020DAO {
	public String getTime();
	public void insertDepartment202044020(Department202044020VO vo);
	
	public Department202044020VO readDepartment202044020(String deptid) throws Exception;
	public void update(Department202044020VO vo) throws Exception;
	public void delete(String deptid) throws Exception;
	public int listCount() throws Exception;
	
	public List<Department202044020VO> listAll() throws Exception;
}
