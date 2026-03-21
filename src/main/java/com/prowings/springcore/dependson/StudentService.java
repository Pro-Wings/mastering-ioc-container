package com.prowings.springcore.dependson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class StudentService {

    private HeavyService heavyService;

    @Autowired
    public StudentService(@Lazy HeavyService heavyService) {
		super();
		this.heavyService = heavyService;
		System.out.println("-----inside constructor of StudentService-------");
	}

	public void process() {
        System.out.println("Processing...");
        heavyService.doWork();
    }
}