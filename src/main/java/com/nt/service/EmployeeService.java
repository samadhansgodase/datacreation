package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repo.EMployeeRepository;

@Service("emp_service")
public class EmployeeService {
	
	@Autowired
	private EMployeeRepository eMployeeRepository;
	
	public void SavDate(Employee emp)
	{
		eMployeeRepository.save( emp);
		System.out.println("Data saved ");
	}
}
