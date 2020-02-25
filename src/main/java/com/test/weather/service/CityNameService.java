package com.test.weather.service;

import java.util.List;

import com.test.weather.entity.CityName;

public interface CityNameService {
	
	Iterable<CityName> findAll();
	
	CityName findByName(String name);
	
	void save(CityName cityName);
	
	void delete(long id);
}
