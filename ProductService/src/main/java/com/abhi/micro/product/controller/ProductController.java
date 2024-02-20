package com.abhi.micro.product.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhi.micro.product.model.Product;
import com.abhi.micro.product.service.ProductService;

@RequestMapping("product/")
@RestController
public class ProductController {
	
	private Logger logger=LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	
	//,headers="Accept=applicaton/json"
	@GetMapping(value="get/products")
	public ResponseEntity<List<Product>> getAllProducts(){
		String methodName="getAllProducts";
		logger.info("Statring of {} API",methodName);
		List<Product> products=productService.getAllProducts();
		logger.info("End of {} API",methodName);
		return new ResponseEntity<>(products,HttpStatus.OK);		
	}

}
