package com.test.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.weather.entity.CityName;

public interface CityNameRepository extends JpaRepository<CityName, Long>{
	
	CityName findByName(String name);
}
