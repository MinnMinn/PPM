package com.test.weather.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.test.weather.entity.CityWeather;

public interface CityWeatherRepository extends JpaRepository<CityWeather, Long>{
	
	List<CityWeather> findByName(String name);
	
	@Query("select c from CityWeather c order by c.name ASC")
	List<CityWeather> findAllOrderByNameDesc();
}
