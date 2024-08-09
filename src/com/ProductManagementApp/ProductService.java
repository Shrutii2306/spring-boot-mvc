package com.ProductManagementApp;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

	List<Product> products = new ArrayList<>();
	
	public void addProduct(Product p) {
		
		products.add(p);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return products;
	}

	public Product getProduct(String name) {
		// TODO Auto-generated method stub
		for (Product product : products) {
			if(product.getName().equals(name))
				return product;
		}
		return null;
	}

	public List<Product> getProductWithText(String string) {
		
		String string2 = string.toLowerCase();
		// TODO Auto-generated method stub
		List<Product> prodsList = new ArrayList<>();
		
		for (Product p : products) {
			
			
			
			if(p.getName().toLowerCase().contains(string2) || p.getModel().toLowerCase().contains(string2))
				prodsList.add(p);
		}
		
		return prodsList;
	}
}
