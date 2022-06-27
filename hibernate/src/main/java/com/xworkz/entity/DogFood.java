package com.xworkz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "dogfood")
@Entity
public class DogFood {
	@Column(name = "NAME")
	private String name;
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO) //auto increment
	@Column(name = "PRICE")
	private double price;
	@Column(name = "QUALITY")
	private String quality;
	@Column(name = "QUANTITY")
	private String quantity;

	public String getName() {
		return name;
	}

	public DogFood() {
		//  Auto-generated default constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public DogFood(String name, double price, String quality, String quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quality = quality;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "DogFood [name=" + name + ", price=" + price + ", quality=" + quality + ", quantity=" + quantity + "]";
	}

}
