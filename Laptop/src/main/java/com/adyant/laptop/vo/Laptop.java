package com.adyant.laptop.vo;

import javax.persistence.Entity;



@Entity
public class Laptop 
{
	private long imei;
	private String brand;
	private double price;
	
	public long getImei() {
		return imei;
	}
	public void setImei(long imei) {
		this.imei = imei;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
