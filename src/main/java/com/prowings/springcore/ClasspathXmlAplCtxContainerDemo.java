package com.prowings.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClasspathXmlAplCtxContainerDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springContext.xml");
		
		Student s1 = ctx.getBean("std2",Student.class);
		
		System.out.println(s1);
		
		System.out.println("main method ended!!");
		
		
	}

}
