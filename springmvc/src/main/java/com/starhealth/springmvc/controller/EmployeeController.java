package com.starhealth.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.starhealth.springmvc.entity.Employee;
import com.starhealth.springmvc.service.IEmployeeService;

@Controller
@RequestMapping("/api/v1/employees")
public class EmployeeController {

	// Request Handler

	// @RequestMapping(value="/add",method = RequestMethod.POST)
	// @ResponseBody
	/*
	 * public String addEmployee(HttpServletRequest request,HttpServletResponse
	 * response,HttpSession session) {
	 * 
	 * 
	 * // logic to get data from html form
	 * 
	 * String eid = request.getParameter("eid"); String ename =
	 * request.getParameter("ename"); String salary =
	 * request.getParameter("salary");
	 * 
	 * 
	 * return eid +" "+ename+" "+salary;
	 * 
	 * }
	 */

	/*
	 * @RequestMapping(value="/add",method = RequestMethod.POST)
	 * 
	 * @ResponseBody public String add(Employee employee) {
	 * 
	 * System.out.println(employee);
	 * 
	 * 
	 * return employee.toString();
	 * 
	 * }
	 */

	
		@Autowired
		IEmployeeService service;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public String add(Employee employee) {

		System.out.println(employee);
		
		int count  = service.addEmployee(employee);

		return  count+ " Record Added Successfully";

	}

	
	@RequestMapping("/getall")
	public  String  getAllEmployees(HttpSession session) {
		
		
	List<Employee>  list =	service.selectAllEmployeees();
		
		System.out.println(list);
		
		session.setAttribute("empList", list);
		
		return "success";
	}
	
	
	
}
