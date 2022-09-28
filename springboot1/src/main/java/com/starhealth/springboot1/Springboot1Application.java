package com.starhealth.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.starhealth.springboot1.beans.Product;
import com.starhealth.springboot1.service.IProductService;
import com.starhealth.springboot1.service.ProductServiceImp;

@SpringBootApplication
public class Springboot1Application {
	
	@Bean
	public Product  getProductObj() {
		
		return new Product();
		
	}

		
	
	
	public static void main(String[] args) {
	
		
		
		
	ApplicationContext context =	SpringApplication.run(Springboot1Application.class, args);
	
		
	IProductService service =			context.getBean(ProductServiceImp.class);
	
	
		System.out.println(service);
		
		service.getProduct();
	
	
	}

}
