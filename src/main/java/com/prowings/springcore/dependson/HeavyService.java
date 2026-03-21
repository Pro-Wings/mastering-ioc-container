package com.prowings.springcore.dependson;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class HeavyService {

	public HeavyService() {
		super();
		System.out.println("-----inside constructor of HeavyService-------");
	}

	public void doWork() {
		System.out.println("Doing heavy work!!!");
	}

	@Override
	public String toString() {
		return "HeavyService []";
	}

}
