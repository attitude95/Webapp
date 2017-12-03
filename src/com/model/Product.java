package com.model;

public class Product {

	private String productName;
	private String enterpriseGstn;
	private float productPrice;
	
	
	public Product() {
		System.out.println("Product Constructor");
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getEnterpriseGstn() {
		return enterpriseGstn;
	}
	public void setEnterpriseGstn(String enterpriseGstn) {
		this.enterpriseGstn = enterpriseGstn;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}
	
}
