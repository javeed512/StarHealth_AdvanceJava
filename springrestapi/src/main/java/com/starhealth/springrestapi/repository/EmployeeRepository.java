package com.starhealth.springrestapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.starhealth.springrestapi.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	public Employee  findByEname(String ename);
	
	public List<Employee>   findBySalaryGreaterThan(double salary);

	
	//public List<Employee>   findByCity(String city);
	
	
	@Query("select e from  Employee e where salary > ?1   order by ename desc")
	public List<Employee>  findBySortedSalary(double salary);
	
	
	
	@Query("select max(e.salary)  from Employee e")
	public  Double   findMaxSalary();
	
}
