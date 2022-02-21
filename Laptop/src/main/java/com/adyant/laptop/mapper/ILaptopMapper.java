package com.adyant.laptop.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.adyant.laptop.dto.LaptopDto;
import com.adyant.laptop.vo.Laptop;


@Mapper(
	    componentModel = "spring"
		)
public interface ILaptopMapper 
{
	ILaptopMapper INSTANCE = Mappers.getMapper(ILaptopMapper.class);
	
	LaptopDto voToDto(Laptop laptop);
	Laptop dtoToVo(LaptopDto laptopDto);

}
