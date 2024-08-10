package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String Name;
	private int Warranty;
	private String Model;
	
	
	public Product(int prodId, String name, int warranty, String model) {
		super();
		this.Id = prodId;
		Name = name;
		Warranty = warranty;
		Model = model;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return Id;
	}
	public void setId(int prodId) {
		this.Id = prodId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getWarranty() {
		return Warranty;
	}
	public void setWarranty(int warranty) {
		Warranty = warranty;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + Id + ", Name=" + Name + ", Warranty=" + Warranty + ", Model=" + Model + "]";
	}
	
	
}
