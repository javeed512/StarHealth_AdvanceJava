package com.starhealth.springdemo;

import java.util.List;

public class Employee { // POJO , BEAN
	
	private int eid;
	private String ename;  // properties
	private double salary;
	private  Address  address;  //HAS A RELATIONSHIP
	private List<String> skills;
	
	
	public Employee() {
		
		System.out.println("Employee() object created...");
		
	}
	
	
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		
		System.out.println("Employee(eid,ename,sal) obj created..");
	}
	
	
	
	
	
	public List<String> getSkills() {
		return skills;
	}


	public void setSkills(List<String> skills) {
		this.skills = skills;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
		
		System.out.println("Setter methods called");
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	

}
