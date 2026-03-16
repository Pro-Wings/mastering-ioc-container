package com.prowings.springcore;

public class Employee {
	
	private int empId;
	private String name;
	private Department department;

	public Employee() {
		super();
		System.out.println("---- no arg constructor called!! ----");
	}
	
//	public Employee(int empId, String name, Department department) {
//		super();
//		System.out.println("---- all arg constructor called!! ----");
//		this.empId = empId;
//		this.name = name;
//		this.department = department;
//	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
		System.out.println("---- setter for empId called!! ----");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("---- setter for emp name called!! ----");
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
		System.out.println("---- setter for emp dept called!! ----");
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + "]";
	}
	

}
