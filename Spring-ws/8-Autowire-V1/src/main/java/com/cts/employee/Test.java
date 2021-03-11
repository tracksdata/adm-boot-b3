package com.cts.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.employee.config.AppConfig;
import com.cts.employee.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService es = ac.getBean(EmployeeService.class);
		
		es.persistEmployee();
		
		

	}

}
