package com.adyant.laptop.service;

import java.util.List;

import com.adyant.laptop.vo.Laptop;

public interface ILaptopService 
{
	public Laptop addLaptop(Laptop laptop); //throws LaptopNotAddedException;
	public List<Laptop> viewAllLaptops();
	public Laptop updateLaptop(Laptop laptop); //throws LaptopNotFound;
	
	

}
