package com.test.weather.model;

import java.util.Arrays;

public class City {
	private long id;
	private String name;
	private long cod;
	private Coord coord;
	private Weather[] weather;
	private String base;
	private Main main;
	private long visibility;
	private Wind wind;
	private Clouds clouds;
	private long dt;
	private Sys sys;
	
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
	public long getCod() {
		return cod;
	}
	public void setCod(long cod) {
		this.cod = cod;
	}
	public Coord getCoord() {
		return coord;
	}
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public Weather[] getWeather() {
		return weather;
	}
	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}
	public String getBase() {
		return base;
	}
	public void setBase(String base) {
		this.base = base;
	}
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public long getVisibility() {
		return visibility;
	}
	public void setVisibility(long visibility) {
		this.visibility = visibility;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Clouds getClouds() {
		return clouds;
	}
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public long getDt() {
		return dt;
	}
	public void setDt(long dt) {
		this.dt = dt;
	}
	public Sys getSys() {
		return sys;
	}
	public void setSys(Sys sys) {
		this.sys = sys;
	}
	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", cod=" + cod + ", coord=" + coord + ", weather="
				+ Arrays.toString(weather) + ", base=" + base + ", main=" + main + ", visibility=" + visibility
				+ ", wind=" + wind + ", clouds=" + clouds + ", dt=" + dt + ", sys=" + sys + "]";
	}
	
}
