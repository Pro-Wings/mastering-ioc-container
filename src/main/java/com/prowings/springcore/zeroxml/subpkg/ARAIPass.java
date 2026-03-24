package com.prowings.springcore.zeroxml.subpkg;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ARAIPass implements Condition{

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		
		System.out.println("---- Fetching Result from ARAI ----");
		return false;
	}

}
