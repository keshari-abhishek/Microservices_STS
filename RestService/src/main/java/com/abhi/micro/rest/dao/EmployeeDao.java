package com.abhi.micro.rest.dao;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.abhi.micro.rest.model.Employee;

@Component
public interface EmployeeDao {
	
	public Map<String,Employee> getAllEmployee();
	
	public Employee getEmployeeById(String emp);
	
	public Map<String,Employee> saveEmployee(Employee emp);
	
	public Employee deleteEmployeeById(String empId);
	
	public Map<String,Employee>  updateEmployee(Employee emp);

}
