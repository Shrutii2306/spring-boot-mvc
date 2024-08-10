package com.example.demo;


import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	ProductDB db;
	
	
//	public void addProduct(Product p) {
//		
//		db.save(p);
////		products.add(p);
//	}
//
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
//		return db.getAll();
		return db.findAll();
	}
//
//	public Product getProduct(String name) {
//		// TODO Auto-generated method stub
//		for (Product product : products) {
//			if(product.getName().equals(name))
//				return product;
//		}
//		return null;
//	}
//
//	public Stream<Product> getProductWithText(String string) {
//		
//		String string2 = string.toLowerCase();
//		// TODO Auto-generated method stub
////		List<Product> prodsList = new ArrayList<>();
////		
////		for (Product p : products) {
////			
////			
////			
////			if(p.getName().toLowerCase().contains(string2) || p.getModel().toLowerCase().contains(string2))
////				prodsList.add(p);
////		}
//		
//		Stream<Product> stream = products.stream();
//		
//		return stream.filter(prod -> prod.getName().toLowerCase().contains(string2)|| prod.getModel().toLowerCase().contains(string2));
//		
////		return prodsList;
//	}
}
