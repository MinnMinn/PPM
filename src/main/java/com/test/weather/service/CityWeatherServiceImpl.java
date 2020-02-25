package com.test.weather.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.weather.entity.CityWeather;
import com.test.weather.repository.CityWeatherRepository;

@Service
public class CityWeatherServiceImpl implements CityWeatherService{

	@Autowired
	CityWeatherRepository cityWeatherRepository;
	

	@Override
	public Iterable<CityWeather> findAllOrderByNameDesc() {
		// TODO Auto-generated method stub
		return cityWeatherRepository.findAllOrderByNameDesc();
	}

	@Override
	public List<CityWeather> findByName(String name) {
		// TODO Auto-generated method stub
		return cityWeatherRepository.findByName(name);
	}

	@Override
	public void save(CityWeather cityWeather) {
		// TODO Auto-generated method stub
		cityWeatherRepository.save(cityWeather);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		cityWeatherRepository.deleteById(id);
	}
}
