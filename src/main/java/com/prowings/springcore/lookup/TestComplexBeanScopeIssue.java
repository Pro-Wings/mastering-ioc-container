package com.prowings.springcore.lookup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prowings.springcore.hybrid.autowiring.Car;

public class TestComplexBeanScopeIssue {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("testComplexBeanIssue.xml");
		
		Library library1 = ctx.getBean(Library.class);
		Library library2 = ctx.getBean(Library.class);
		
		System.out.println("Reference Eq of lib objects : "+(library1 == library2));

		System.out.println("Reference Eq of lib.book objects : "+(library1.getBook() == library2.getBook()));
		
		ctx.close();
		
		System.out.println("main method ended!!");

		
		
	}

}
