package com.starhealth.springboot1.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.starhealth.springboot1.beans.Product;

@Repository
public class ProductRepoImp implements IProductRepo {

	@Autowired
	Product product;
	
	@Override
	public void getProduct() {
		
		product.setPid(101);
		product.setPname("Laptop");
		product.setPrice(45000);

		System.out.println("Product in Repo "+product);

		System.out.println("Product Repo Back end logics");

	}

}
