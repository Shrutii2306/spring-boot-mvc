package com.productSpringWeb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int warranty;
	private String model;
	
	
	public Product(int prodId, String name, int warranty, String model) {
		super();
		this.id = prodId;
		name = name;
		warranty = warranty;
		model = model;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int prodId) {
		this.id = prodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + id + ", Name=" + name + ", Warranty=" + warranty + ", Model=" + model + "]";
	}
	
	
}
