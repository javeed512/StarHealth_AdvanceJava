package com.starhealth.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.starhealth.exception.dto.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	
	@GetMapping("/get")
	public String  get() {
		
		String msg = "Welcome Friends";
		
		int len = msg.length();
		
		return msg +" lenght is "+len;
		
		
		
	}
	
	@PostMapping(path="/add",consumes = {"application/xml"},produces = {"application/xml"})
	public Customer   addCustomer(@RequestBody Customer customer) {
		
		System.out.println(customer);
		
		//int x = 9/0;
		
		
		return customer;
		
		
	}

	/*
	 * @ExceptionHandler(value = NullPointerException.class)
	 * 
	 * @ResponseStatus(reason = "Null value found , exception occur") public void
	 * exceptionHandler() {
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	/*
	 * @ExceptionHandler(value = NullPointerException.class)
	 * 
	 * @ResponseStatus(code=HttpStatus.BAD_REQUEST, reason =
	 * "Null value found , exception occur") public void exceptionHandler() {
	 * 
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @ExceptionHandler(value=ArithmeticException.class) public
	 * ResponseEntity<String> exceptionHandler2(){
	 * 
	 * 
	 * return new
	 * ResponseEntity<String>("Sorry number can't be div by zero",HttpStatus.
	 * NOT_ACCEPTABLE);
	 * 
	 * }
	 */
	
	
	

}
