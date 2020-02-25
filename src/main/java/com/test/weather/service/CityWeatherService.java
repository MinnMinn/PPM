package com.test.weather.service;

import java.util.List;

import com.test.weather.entity.CityWeather;

public interface CityWeatherService {
	
	Iterable<CityWeather> findAllOrderByNameDesc();
	
	List<CityWeather>findByName(String name);
	
	void save(CityWeather cityWeather);
	
	void delete(long id);
}
