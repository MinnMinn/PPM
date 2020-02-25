package com.test.weather.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.annotations.Sort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.weather.entity.CityName;
import com.test.weather.entity.CityWeather;
import com.test.weather.model.City;
import com.test.weather.repository.CityWeatherRepository;
import com.test.weather.service.CityNameService;
import com.test.weather.service.CityWeatherService;

@Controller
public class WeatherController {
	
	public static Logger logger = LoggerFactory.getLogger(WeatherController.class);

	@Autowired
	CityWeatherService cityWeatherService;
	
	@Autowired
	CityNameService cityNameService;
	
	@GetMapping("/city")
	public String retrieveAllCity(Model model) {
		Iterable<CityName> cityName = cityNameService.findAll();
		for(CityName s : cityName) {
			model.addAttribute("list", cityWeatherService.findAllOrderByNameDesc());
		}
		return "index";
	}
	
	@PostMapping(value = {"/city" })
    public String addCityWeather(HttpServletRequest request, RedirectAttributes redirect, @RequestParam(name="name", required=true) String name) {
       boolean flag = false;
		ObjectMapper mapper = new ObjectMapper();
        try {
            City test = mapper.readValue(new URL("http://api.openweathermap.org/data/2.5/weather?appid=3936398c9499250a801828ab0dd73ed1&units=metric&q=" + name), City.class);
            CityWeather cityWeather = new CityWeather();
            cityWeather.setName(test.getName());
            cityWeather.setTemp(test.getMain().getTemp());
            cityWeather.setMain(test.getWeather()[0].getMain());
            cityWeather.setHumidity(test.getMain().getHumidity());
            cityWeather.setPressure(test.getMain().getPressure());
            cityWeatherService.save(cityWeather);
            flag = true;
        } catch (IOException e) {
        	redirect.addFlashAttribute("fail", "Không tìm thấy thành phố này");
        }
        
        CityName s = cityNameService.findByName(name);
        System.out.println(s);
        if(s == null && flag == true) {
        	CityName city = new CityName();
			city.setName(name);
			cityNameService.save(city);
        }
        
        request.setAttribute("msg", "Asoview");
        return "redirect:/city";
        
        //findByName theo ten thanh pho => tim ko thay se add thanh pho moi vao class City (tao moi) => Dùng vòng lặp để truy vấn danh sách dựa vào tên thành phố.
    }
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable long id, RedirectAttributes redirect) {
		cityWeatherService.delete(id);
		redirect.addFlashAttribute("success", "Delete city successfully !");
		return "redirect:/city";
	}
	
	@RequestMapping("/search")
	public String Search( Model model, @RequestParam(name="ten", required=true) String ten) {
		Iterable<CityName> cityName = cityNameService.findAll();
		for(CityName s : cityName) {
			model.addAttribute("list", cityWeatherService.findByName(ten));
		}
        return "index";
	}
}
