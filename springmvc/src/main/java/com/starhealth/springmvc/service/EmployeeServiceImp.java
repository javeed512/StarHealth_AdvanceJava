package com.starhealth.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starhealth.springmvc.entity.Employee;
import com.starhealth.springmvc.repository.IEmployeeDAO;
@Service
public class EmployeeServiceImp implements IEmployeeService {

	@Autowired
	IEmployeeDAO  dao ;
	
	
	@Override
	public int addEmployee(Employee emp) {
		
		return  dao.addEmployee(emp);
	}

	

	@Override
	public List<Employee> selectAllEmployeees() {
		
		return dao.selectAllEmployeees();
	}

	
	
	
	
	
	
}
