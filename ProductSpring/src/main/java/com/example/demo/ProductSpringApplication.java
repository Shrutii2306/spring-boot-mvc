package com.example.demo;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProductSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductSpringApplication.class, args);
		
		ProductService service = context.getBean(ProductService.class);
//		service.show();
		List<Product> products = service.getAllProducts();
		
		for (Product product : products) {
			
			System.out.println(product);
			
		}
	}

}
