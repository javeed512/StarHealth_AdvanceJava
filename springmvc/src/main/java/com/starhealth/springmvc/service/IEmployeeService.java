package com.starhealth.springmvc.service;

import java.util.List;

import com.starhealth.springmvc.entity.Employee;

public interface IEmployeeService {
	
	
	
	public int  addEmployee(Employee emp); //post
	
	
	public List<Employee>  selectAllEmployeees(); //get 
	
	

}
