package com.starhealth.exception.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {  // Global exception handler

		
		@ExceptionHandler(value=Exception.class)
		public ResponseEntity<String>  handler(){
			
	return new ResponseEntity<String>("Some Error occur please check",HttpStatus.NOT_FOUND);
			
			
		}
	
	
}
