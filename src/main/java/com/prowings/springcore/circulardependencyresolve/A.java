package com.prowings.springcore.circulardependencyresolve;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A {
	
	private B b;

	public A(@Lazy B b) {
		super();
		this.b = b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	

}
