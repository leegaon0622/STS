package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.StudentVO;

public interface StudentInfoDAO {
	public String getTime();
	public void insertStudent(StudentVO vo);
	
	public StudentVO readStudent(String studentid) throws Exception;
	public void update(StudentVO vo) throws Exception;
	public void delete(String studentid) throws Exception;
	public int listCount() throws Exception;
	
	public List<StudentVO> listAll() throws Exception;
}
