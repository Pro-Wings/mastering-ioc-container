package com.prowings.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClasspathXmlAplCtxContainerDemoForConstructorInjection {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("employeeBean.xml");
		
		Employee emp = ctx.getBean(Employee.class);
		
		System.out.println(emp);
		
		System.out.println("main method ended!!");
		
		
	}

}
