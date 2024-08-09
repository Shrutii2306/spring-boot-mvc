package com.ProductManagementApp;

public class Product {

	private int prodId;
	private String Name;
	private int Warranty;
	private String Model;
	
	
	public Product(int prodId, String name, int warranty, String model) {
		super();
		this.prodId = prodId;
		Name = name;
		Warranty = warranty;
		Model = model;
	}
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
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
		return "Product [prodId=" + prodId + ", Name=" + Name + ", Warranty=" + Warranty + ", Model=" + Model + "]";
	}
	
	
}
