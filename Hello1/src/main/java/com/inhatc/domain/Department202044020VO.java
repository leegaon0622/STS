package com.inhatc.domain;

public class Department202044020VO {
	private String deptid;
	private String deptname;
	private int count;
	private int classname;
	public String getDeptid() {
		return deptid;
	}
	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getClassname() {
		return classname;
	}
	public void setClassname(int classname) {
		this.classname = classname;
	}
	@Override
	public String toString() {
		return "Department202044020VO [deptid=" + deptid + ", deptname=" + deptname + ", count=" + count
				+ ", classname=" + classname + "]";
	}
	
	
	
}
