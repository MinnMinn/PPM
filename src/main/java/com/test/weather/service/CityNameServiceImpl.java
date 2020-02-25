package com.test.weather.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.weather.entity.CityName;
import com.test.weather.entity.CityWeather;
import com.test.weather.repository.CityNameRepository;
import com.test.weather.repository.CityWeatherRepository;

@Service
public class CityNameServiceImpl implements CityNameService{

	@Autowired
	CityNameRepository cityNameRepository;
	

	@Override
	public Iterable<CityName> findAll() {
		// TODO Auto-generated method stub
		return cityNameRepository.findAll();
	}

	@Override
	public CityName findByName(String name) {
		// TODO Auto-generated method stub
		return cityNameRepository.findByName(name);
	}

	@Override
	public void save(CityName cityName) {
		// TODO Auto-generated method stub
		cityNameRepository.save(cityName);
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		cityNameRepository.deleteById(id);
	}
}
