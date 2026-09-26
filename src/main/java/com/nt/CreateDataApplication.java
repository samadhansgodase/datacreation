package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.entity.Employee;
import com.nt.service.EmployeeService;

@SpringBootApplication
public class CreateDataApplication {

	public static void main(String[] args) {
		ApplicationContext ctApplicationContext=
		SpringApplication.run(CreateDataApplication.class, args);
		 EmployeeService employeeService=ctApplicationContext.getBean("emp_service", EmployeeService.class);
		 
		 Employee dataemp=new Employee();
		 dataemp.setName("Samadhan Godase");
		 dataemp.setBillFloat(152.45f);
		 employeeService.SavDate(dataemp);
		 System.out.println("Done");
	}

}
