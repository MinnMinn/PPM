package com.test.weather.entity;

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
@Table(name="CityName")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class CityName {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic
	@NotNull
	@Column(name = "Id")
	private long id;
	@Basic
	@NotNull
	@Column(name = "Name", columnDefinition = "NVARCHAR(50)", unique=true)
	private String name;
	
	public CityName() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityName(@NotNull long id, @NotNull String name) {
		super();
		this.id = id;
		this.name = name;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "CityName [id=" + id + ", name=" + name + "]";
	}
}
