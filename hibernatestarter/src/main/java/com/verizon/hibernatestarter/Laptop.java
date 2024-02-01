package com.verizon.hibernatestarter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "laptop")
public class Laptop {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "manufacturer")
	String manufacturer;
	
	public Laptop() {
		
	}

	public Laptop(String name, String manufacturer) {
		super();
//		this.id=id;
		this.name = name;
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

}
