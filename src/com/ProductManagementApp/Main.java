package com.ProductManagementApp;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService service = new ProductService();
		
		service.addProduct( new Product(101,"Laptop 35",2025,"HP"));
		service.addProduct( new Product(102,"Monitor 42",2022,"Dell"));
		service.addProduct( new Product(103,"Mouse 43",2024,"Lenovo"));
		service.addProduct( new Product(104,"KeyBoard 23",2021,"HP"));
		service.addProduct( new Product(105,"Laptop 53",2023,"Lenovo"));
		service.addProduct( new Product(106,"Speakers 22",2025,"Boat"));
		service.addProduct( new Product(107,"Camera 15",2020,"HP"));
		service.addProduct( new Product(108,"Laptop 24",2021,"Dell"));
		
//		List<Product> products = service.getAllProducts();
//		
//		for(Product p : products) {
//			
////			System.out.println(p);
//		}
		
		System.out.println("==============================================");
		System.out.println("A particular name(first occurance)");
//		Product p = service.getProduct("Mouse");
//		System.out.println(p);
		
		System.out.println("==============================================");
		System.out.println("A particular text");
		
		List<Product> prodsList = service.getProductWithText("laptop");
		for(Product p : prodsList) {
			
			System.out.println(p);
		}
	}

}
