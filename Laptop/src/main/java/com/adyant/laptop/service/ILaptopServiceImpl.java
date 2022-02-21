package com.adyant.laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adyant.laptop.dto.LaptopDto;
import com.adyant.laptop.mapper.ILaptopMapper;
import com.adyant.laptop.repo.ILaptopRepo;
import com.adyant.laptop.vo.Laptop;

@Service
public class ILaptopServiceImpl implements ILaptopService
{
	@Autowired
	private ILaptopRepo iLaptopRepo;
	
	@Autowired
	private ILaptopMapper iLaptopMapper;

	@Override
	public Laptop addLaptop(Laptop laptop) 
	{
		LaptopDto laptopDto = iLaptopMapper.voToDto(laptop);
		LaptopDto laptopDtoAdded = iLaptopRepo.save(laptopDto);
		Laptop laptopVo = iLaptopMapper.dtoToVo(laptopDtoAdded);
		return laptopVo;
	}

	@Override
	public List<Laptop> viewAllLaptops() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Laptop updateLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return null;
	}

}
