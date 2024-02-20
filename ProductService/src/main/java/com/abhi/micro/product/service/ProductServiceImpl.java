package com.abhi.micro.product.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.abhi.micro.product.model.Product;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	private static Logger logger=LoggerFactory.getLogger(ProductServiceImpl.class);
	
	static List<Product> products;
	static {
		products=new ArrayList<Product>();
		initProduct();
	}
	
	private static void initProduct() {
		String methodName="initProduct";
		logger.info("Starting of method {} of class ",methodName,ProductServiceImpl.class);
		Product pro1=new Product(1,"Laptop");
		Product pro2=new Product(2,"Mouse");
		Product pro3=new Product(3,"Keyboard");
		Product pro4=new Product(4,"Data Cable");		
		products.addAll(Arrays.asList(pro1,pro2,pro3,pro4));		
		logger.info("End of method {} of class ",methodName,ProductServiceImpl.class);	
	}

	@Override
	public List<Product> getAllProducts() {
		String methodName="getAllProducts";
		logger.info("Starting of method {} of class ",methodName,ProductServiceImpl.class);
		logger.info("End of method {} of class ",methodName,ProductServiceImpl.class);	
		return products;
	}

}
