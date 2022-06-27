package com.xworkz.entity;

import javax.persistence.*;

@Entity
@Table(name = "dog_tb")
public class DogDTO {
	@Id
	@Column(name = "DOG_ID")
	private int dogId;
	@Column(name = "DOGNAME")
	private String name;
	@Column(name = "DOGCOLOR")
	private String color;

	public DogDTO(int dogId, String name, String color) {
		super();
		this.dogId = dogId;
		this.name = name;
		this.color = color;
	}

	public DogDTO() {

	}

	public int getDogId() {
		return dogId;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "DogDTO [dogId=" + dogId + ", name=" + name + ", color=" + color + "]";
	}

}
