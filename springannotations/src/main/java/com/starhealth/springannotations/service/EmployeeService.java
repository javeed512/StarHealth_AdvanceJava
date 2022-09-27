package com.starhealth.springannotations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starhealth.springannotations.dao.EmployeeRepositoryImp;
import com.starhealth.springannotations.dao.IEmployeeRepository;

@Service
public class EmployeeService  implements IEmployeeService {

	
	@Autowired
	IEmployeeRepository repo;
	
	
	@Override
	public void callService() {


		System.out.println(" Service method is called");
		System.out.println("service getting repo obj "+repo);
		
	}

}
