package com.test.weather.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="CityWeather")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CityWeather implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic
	@NotNull
	@Column(name = "Id")
	private long id;
	@Basic
	@NotNull
	@Column(name = "Name", columnDefinition = "NVARCHAR(50)")
	private String name;
	@Basic
	@NotNull
	@Column(name = "Temp")
	private float temp;
	@Basic
	@NotNull
	@Column(name = "Main", columnDefinition= "NVARCHAR(50)")
	private String main;
	@Basic
	@NotNull
	@Column(name = "humidity")
	private float humidity;
	@Basic
	@NotNull
	@Column(name = "Pressure")
	private float pressure;
	
	public CityWeather() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityWeather(long id, String name, float temp, String main, float humidity, float pressure) {
		super();
		this.id = id;
		this.name = name;
		this.temp = temp;
		this.main = main;
		this.humidity = humidity;
		this.pressure = pressure;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return "CityWeather [id=" + id + ", name=" + name + ", temp=" + temp + ", main=" + main + ", humidity="
				+ humidity + ", pressure=" + pressure + "]";
	}
	
}
