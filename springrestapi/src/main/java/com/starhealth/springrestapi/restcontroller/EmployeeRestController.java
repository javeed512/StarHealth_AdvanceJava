package com.starhealth.springrestapi.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.starhealth.springrestapi.entity.Employee;
import com.starhealth.springrestapi.service.IEmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	// @RequestMapping(value="/add",method= RequestMethod.POST)
	@PostMapping("/add")
	public Employee add(@RequestBody Employee emp) {

		return service.addEmployee(emp);

	}

	@PutMapping("/update")
	public Employee update(@RequestBody Employee emp) {

		return service.updateEmployee(emp);

	}

	@DeleteMapping("/delete/{id}") // http://localhost:8080/api/v1/employees/delete/101
	public String delete(@PathVariable int id) {

		service.deleteEmployeeById(id);

		return "Recored Deleted Successfully";

	}

	@GetMapping("/get/{id}")
	public Employee getById(@PathVariable int id) { // http://localhost:8080/api/v1/employees/get/101

		return service.selectEmployeeById(id);

	}

	@GetMapping("/getall")
	public List<Employee> getAll() { // http://localhost:8080/api/v1/employees/getall

		return service.selectAllEmployees();

	}

	@GetMapping("/getbyename/{ename}")
	public Employee selectByEName(@PathVariable String ename) {

		return service.selectByEName(ename);

	}

	@GetMapping("/get/salarygt/{salary}")
	public List<Employee> selectBySalaryGT(@PathVariable double salary){
		
		
		return  service.selectBySalaryGT(salary);
		
	}
	
	
	@GetMapping("/get/sortedsalary/{salary}")
	public List<Employee>  getSortedSalary(@PathVariable double salary){
		
		
		return service.selectSortedSalary(salary);
		
		
	}
	
	
	
	
	
	
	
	
	

}
