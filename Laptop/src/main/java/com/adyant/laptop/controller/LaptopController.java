package com.adyant.laptop.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adyant.laptop.service.ILaptopService;
import com.adyant.laptop.vo.Laptop;

@RestController
@RequestMapping(value = "/laptop")
public class LaptopController 
{
	@Autowired
	private ILaptopService iLaptopService;
	
	@PostMapping(value ="/addlaptop")
	public ResponseEntity<Laptop> addLaptop(@Valid @RequestBody Laptop laptop)
	{
		Laptop addedLaptop  = iLaptopService.addLaptop(laptop);
		return new ResponseEntity<Laptop>(addedLaptop, HttpStatus.CREATED);
		
	}
	

}
