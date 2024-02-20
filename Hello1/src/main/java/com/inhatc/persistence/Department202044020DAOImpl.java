package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import com.inhatc.domain.Department202044020VO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class Department202044020DAOImpl implements Department202044020DAO{

	@Inject
	private SqlSession sqlSession ;
	private static final String namespace = "com.inhatc.mapper.Department202044020Mapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime"); 
	}
	
	@Override
	public void insertDepartment202044020(Department202044020VO vo) {
		sqlSession.insert(namespace+".insertDepartment202044020", vo);
	}
	
	@Override
	public Department202044020VO readDepartment202044020(String deptid) throws Exception {
	      return (Department202044020VO)sqlSession.selectOne(namespace+".selectDepartment202044020", deptid);
	   }
	
	
	@Override
	public void update(Department202044020VO vo) throws Exception{
		sqlSession.update(namespace+".update", vo);		
	}
	
	@Override
	public void delete(String deptid) throws Exception{
		sqlSession.delete(namespace+".delete", deptid);		
	}
	
	@Override
	public int listCount() throws Exception{
		return sqlSession.selectOne(namespace+".listCount");
	}
	
	@Override
	public List<Department202044020VO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}
}
	
