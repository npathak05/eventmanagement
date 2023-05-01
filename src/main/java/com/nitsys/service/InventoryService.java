package com.nitsys.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.nitsys.dto.Product;

@Service
public class InventoryService {
	
	
	  public List<Product> getAllProduct(){
	  
	  return Arrays.asList(new Product(1, "Mobile", 5000.32),new Product(2, "TV", 10000.54));
			  
			 	  
	  
	  }
	 

}
