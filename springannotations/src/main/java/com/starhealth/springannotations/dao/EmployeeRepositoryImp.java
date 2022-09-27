package com.starhealth.springannotations.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.starhealth.springannotations.beans.Student;

@Repository("repo")
public class EmployeeRepositoryImp  implements IEmployeeRepository{

	
	@Autowired
	Student student;
	
	
	
	@Override
	public void getRepo() {


		System.out.println("getRepo() from Repository/DAO is called...");
		
		System.out.println("student in repo "+student);
		//System.out.println("employee in repo "+employee);
		
	}

}
