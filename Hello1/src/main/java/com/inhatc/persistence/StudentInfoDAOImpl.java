package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import com.inhatc.domain.StudentVO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class StudentInfoDAOImpl implements StudentInfoDAO{

	@Inject
	private SqlSession sqlSession ;
	private static final String namespace = "com.inhatc.mapper.StudentInfoMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime"); 
	}
	
	@Override
	public void insertStudent(StudentVO vo) {
		sqlSession.insert(namespace+".insertStudent", vo);
	}
	
	@Override
	public StudentVO readStudent(String studentid) throws Exception {
	      return (StudentVO)sqlSession.selectOne(namespace+".selectStudent", studentid);
	   }
	
	@Override
	public void update(StudentVO vo) throws Exception{
		sqlSession.update(namespace+".update", vo);		
	}
	
	@Override
	public void delete(String studentid) throws Exception{
		sqlSession.delete(namespace+".delete", studentid);		
	}
	
	@Override
	public int listCount() throws Exception{
		return sqlSession.selectOne(namespace+".listCount");
	}
	
	@Override
	public List<StudentVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}
}