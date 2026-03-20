package com.prowings.springcore.hybrid.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.abc.emp.Employee;

@Component
public class CreatingBeanOfClassFromJar {
	
	@Bean(name = "emp")
	public Employee getEmployee()
	{
		Employee emp = new Employee();
		emp.setEmpId(1234);
		emp.setName("Ram");
		emp.setDept("HR");
		
		return emp;
	}

}
