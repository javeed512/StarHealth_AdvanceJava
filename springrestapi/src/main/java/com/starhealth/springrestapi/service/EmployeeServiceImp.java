package com.starhealth.springrestapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starhealth.springrestapi.entity.Employee;
import com.starhealth.springrestapi.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {

			@Autowired
		EmployeeRepository repo;
	
	
	@Override
	public Employee addEmployee(Employee emp) {
		
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return repo.save(emp);
	}

	@Override
	public Employee selectEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(new Employee());
	}

	@Override
	public void deleteEmployeeById(int id) {

			repo.deleteById(id);

	}

	@Override
	public List<Employee> selectAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Employee selectByEName(String ename) {
		// TODO Auto-generated method stub
		return repo.findByEname(ename);
	}

	@Override
	public List<Employee> selectBySalaryGT(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> selectSortedSalary(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySortedSalary(salary);
	}

}
