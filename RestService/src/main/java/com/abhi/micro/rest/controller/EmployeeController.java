package com.abhi.micro.rest.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.micro.rest.dao.EmployeeDao;
import com.abhi.micro.rest.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeDao employeeDao;
	
	@RequestMapping(value="/get/employees",method=RequestMethod.GET,produces= {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public Map<String,Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}
	
	@RequestMapping(value="/get/{empId}",method=RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable String empId) {
		return employeeDao.getEmployeeById(empId);
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public Map<String,Employee> saveEmployee(@RequestBody Employee employee){
		return employeeDao.saveEmployee(employee);
	}
	
	@RequestMapping(value="/delete/{empId}",method=RequestMethod.DELETE)
	public Employee deleteEmployeeById(@PathVariable String empId) {
		return employeeDao.deleteEmployeeById(empId);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public Map<String,Employee> updateEmployee(@RequestBody Employee emp){
		return employeeDao.updateEmployee(emp);
	}
	
	
	
	
}
