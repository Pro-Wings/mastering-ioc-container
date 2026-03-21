package com.prowings.springcore.dependson;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.emp.Employee;

public class TestLazyBehaviour {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("testDependsOn.xml");
		
//		StudentService service = ctx.getBean(StudentService.class);
//		
//		service.process();
		
		
		ctx.close();
		System.out.println("main method ended!!");

		
		
	}

}
