package com.prowings.springaop;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	
	
	public String doPayment(int val1, String accNum)
	{
		System.out.println("--- Payment in progress ---");
		
		System.out.println("--------Arg 1 : "+val1);
		System.out.println("--------Arg 2 : "+accNum);
		
//		doVerifyAccount("abc1234");
		System.out.println("--- Payment completed ---");
		return "success!!";
//		throw new RuntimeException("some error in Payment processing!!!");
	}

//	public boolean doVerifyAccount(String accountNumber)
//	{
//		System.out.println("--- Acc verification in progress ---");
//		return true;
//	}

}
