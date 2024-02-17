package com.abhi.micro.rest.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.abhi.micro.rest.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao{
	
	static {
		empList=new HashMap<>();
		initEmployee();
	}
	
	private static void initEmployee() {
		final Employee emp1=new Employee("E001","Abhishek","Keshari");
		final Employee emp2=new Employee("E002","Nani","Kumari");
		final Employee emp3=new Employee("E003","Ron","Jakson");
		
		empList.put(emp1.getId(),emp1);
		empList.put(emp2.getId(),emp2);
		empList.put(emp3.getId(),emp3);		
	}
	
	static Map<String,Employee> empList;
	
	public Map<String,Employee> getAllEmployee(){
		return empList;
	}
	
	public Employee getEmployeeById(String empId){
		return empList.get(empId);
	}
	
	public Map<String,Employee> saveEmployee(Employee emp){
		empList.put(emp.getId(), emp);
		return empList;
	}
	
	public Employee deleteEmployeeById(String id) {
		Employee emp=empList.get(id);
		Employee deletedEmp=empList.remove(emp.getId());
		return deletedEmp;
	}
	
	public Map<String,Employee> updateEmployee(Employee emp) {
		Employee tempEmp=empList.get(emp.getId());
		tempEmp.setFirstName(emp.getFirstName());
		tempEmp.setLastName(emp.getLastName());
		empList.put(tempEmp.getId(),tempEmp);
		return empList; 
	}
}
