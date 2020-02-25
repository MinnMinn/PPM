package com.test.weather.model;

public class Main {
	private float temp;
	private long pressure;
	private long humidity;
	private float temp_min;
	private float temp_max;
	private float sea_level;
	private float grnd_level;
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	public long getPressure() {
		return pressure;
	}
	public void setPressure(long pressure) {
		this.pressure = pressure;
	}
	public long getHumidity() {
		return humidity;
	}
	public void setHumidity(long humidity) {
		this.humidity = humidity;
	}
	public float getTemp_min() {
		return temp_min;
	}
	public void setTemp_min(float temp_min) {
		this.temp_min = temp_min;
	}
	public float getTemp_max() {
		return temp_max;
	}
	public void setTemp_max(float temp_max) {
		this.temp_max = temp_max;
	}
	public float getSea_level() {
		return sea_level;
	}
	public void setSea_level(float sea_level) {
		this.sea_level = sea_level;
	}
	public float getGrnd_level() {
		return grnd_level;
	}
	public void setGrnd_level(float grnd_level) {
		this.grnd_level = grnd_level;
	}
	@Override
	public String toString() {
		return "Main [temp=" + temp + ", pressure=" + pressure + ", humidity=" + humidity + ", temp_min=" + temp_min
				+ ", temp_max=" + temp_max + ", sea_level=" + sea_level + ", grnd_level=" + grnd_level + "]";
	}
	
	
}
