package com.starhealth.springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.starhealth.springboot1.repo.IProductRepo;

@Service
public class ProductServiceImp implements IProductService {

	
		@Autowired
		IProductRepo repo;
	
	
	
	@Override
	public void getProduct() {

			System.out.println("Product Service");

			System.out.println(repo);			
			repo.getProduct();

	}

}
