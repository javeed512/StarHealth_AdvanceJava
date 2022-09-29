package com.starhealth.springmvc.entity;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Employee {

	private int eid;
	private String ename;
	private double salary;
	private  String job;
	private  Date doj;
	private int comm;
	
	
}
