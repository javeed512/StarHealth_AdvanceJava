package com.starhealth.springmvc.repository;

import java.util.List;

import com.starhealth.springmvc.entity.Employee;

public interface IEmployeeDAO {
	
	
	
	public int  addEmployee(Employee emp);
	
	
	public List<Employee>  selectAllEmployeees();
	
	

}
