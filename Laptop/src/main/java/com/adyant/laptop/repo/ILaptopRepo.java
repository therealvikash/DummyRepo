package com.adyant.laptop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.adyant.laptop.dto.LaptopDto;
import com.adyant.laptop.vo.Laptop;

@EnableJpaRepositories
@Repository
public interface ILaptopRepo extends JpaRepository<Laptop, Long>
{

	LaptopDto save(LaptopDto laptopDto);

}
