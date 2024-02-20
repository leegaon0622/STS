package com.inhatc.persistence;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import com.inhatc.domain.MemberVO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{

	@Inject
	private SqlSession sqlSession ;
	private static final String namespace = "com.inhatc.mapper.MemberMapper";
	
	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace+".getTime"); 
	}
	
	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert(namespace+".insertMember", vo);
	}
	
	@Override
	public MemberVO readMember(String userid) throws Exception {
	      return (MemberVO)sqlSession.selectOne(namespace+".selectMember", userid);
	   }
	
	@Override
	public MemberVO readMemberWithPW(String userid, String userpw) throws Exception {
	      Map<String, Object> paramMap = new HashMap<String, Object>();
	      paramMap.put("userid", userid);
	      paramMap.put("userpw", userpw);
	      return sqlSession.selectOne(namespace+".selectMemberWithPW", paramMap);
	   }
	
	@Override
	public void update(MemberVO vo) throws Exception{
		sqlSession.update(namespace+".update", vo);		
	}
	
	@Override
	public void delete(String userid) throws Exception{
		sqlSession.delete(namespace+".delete", userid);		
	}
	
	@Override
	public int listCount() throws Exception{
		return sqlSession.selectOne(namespace+".listCount");
	}
	
	@Override
	public List<MemberVO> listAll() throws Exception{
		return sqlSession.selectList(namespace+".listAll");
	}
}
