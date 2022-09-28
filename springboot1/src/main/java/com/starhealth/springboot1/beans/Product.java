package com.starhealth.springboot1.beans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Data



public class Product {
	
	
	private int pid;
	private String pname;
	private double  price;  // new Product(); // p.setPid(111)
	

}
