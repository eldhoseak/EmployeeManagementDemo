package com.ems.service;

import com.ems.model.Employee;

public class EmployeeService {

	
	
	public Employee createEmployee(String id,String name, String email) {
		
		Employee employee= new Employee(id, name, email);
		
		return employee;
	}
}
