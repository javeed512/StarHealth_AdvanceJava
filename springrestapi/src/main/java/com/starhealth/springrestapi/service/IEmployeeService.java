package com.starhealth.springrestapi.service;

import java.util.List;

import com.starhealth.springrestapi.entity.Employee;

public interface IEmployeeService {
	
	public Employee  addEmployee(Employee emp);
	public Employee  updateEmployee(Employee emp);
	
	public Employee selectEmployeeById(int id);
	public void    deleteEmployeeById(int id);
	
	
	public List<Employee>  selectAllEmployees();
	
	

}
