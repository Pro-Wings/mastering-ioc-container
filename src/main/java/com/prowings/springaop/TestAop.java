package com.prowings.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prowings.springcore.zeroxml.MyApplicationConfig;

public class TestAop {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!");

		ApplicationContext ctx = new AnnotationConfigApplicationContext(MyAopAppConfig.class);

		PaymentService service = ctx.getBean(PaymentService.class);
		
		System.out.println("Actual res of target method : "+ service.doPayment(123, "acc123"));
		
		System.out.println("main method ended!!");

		
		
	}

}
