package com.prowings.springcore;

public class Department {
	
	private int deptId;
	private String name;
	
	public Department() {
		super();
	}

	public Department(int deptId, String name) {
		super();
		System.out.println("---- all arg constructor called!! ----");
		this.deptId = deptId;
		this.name = name;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
		System.out.println("---- setter for dept id called!! ----");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("---- setter for dept name called!! ----");
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", name=" + name + "]";
	}

}
