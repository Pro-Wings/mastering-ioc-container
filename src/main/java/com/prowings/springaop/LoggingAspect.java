package com.prowings.springaop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(* com.prowings.springaop..*(..))")
	public void logBeforePayment()
	{
		System.out.println(">>>>>> PAYMENT STARTED <<<<<<");
	}

	
//	@After("execution(* com.prowings.springaop..*(..))")
//	@AfterReturning("execution(* com.prowings.springaop..*(..))")
	@AfterThrowing("execution(* com.prowings.springaop..*(..))")
	public void logAfterPayment()
	{
		System.out.println(">>>>>> PAYMENT ENDED <<<<<<");
	}
	
	
	@Around("execution(* com.prowings.springaop..*(..))")
	public Object aroundAdviceDemo(ProceedingJoinPoint joinPoint) throws Throwable
	{
		System.out.println(">>>>>> AROUND ADVICE started... <<<<<<");
		
		Object[] methodArgs = joinPoint.getArgs();
		
		methodArgs[0] = 999;
		
		//call actual/target method
		String res = (String) joinPoint.proceed(methodArgs);
		
		System.out.println(res);
		
		System.out.println(">>>>>> AROUND ADVICE eneded...<<<<<<");
		
		return res+"QQQQ";
	}

}
