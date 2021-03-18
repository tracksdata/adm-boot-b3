package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDaoImpl;

@Service
public class ProductServiceImpl {
	
	@Value("${name}")
	private String personName;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private ProductDaoImpl prodDao;

	public ProductServiceImpl() {
		System.out.println(">>> ProductServiceImpl object instanciated..");
	}

	@Bean
	public void f1() {
		System.out.println(">>> ProductServiceImpl f1 method...");
	}

	public void f2() {
		System.out.println("Name using env: "+env.getProperty("name"));
		System.out.println(">>> Name is "+personName);
		System.out.println(">>> ProductServiceImpl f2 method");
		prodDao.save();
	}

}
