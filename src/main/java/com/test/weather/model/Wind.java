package com.test.weather.model;

public class Wind {
	private float speed;
	private long deg;
	private float gust;
	public float getSpeed() {
		return speed;
	}
	public void setSpeed(float speed) {
		this.speed = speed;
	}
	public long getDeg() {
		return deg;
	}
	public void setDeg(long deg) {
		this.deg = deg;
	}
	public float getGust() {
		return gust;
	}
	public void setGust(float gust) {
		this.gust = gust;
	}
	@Override
	public String toString() {
		return "Wind [speed=" + speed + ", deg=" + deg + ", gust=" + gust + "]";
	}
	
	
}
