package com.xworkz.dog;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dog_table")
public class Dog {
	@Id
	@Column(name = "DOG_ID")
	private int dog_Id;

	@Column(name = "DOG_NAME")
	private String name;

	@Column(name = "BREED")
	private String breed;

	@Column(name = "COLOR")
	private String color;

	@Column(name = "WEIGHT")
	private double weight;

	public int getDog_Id() {
		return dog_Id;
	}

	public void setDog_Id(int dog_Id) {
		this.dog_Id = dog_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Dog() {

	}

	protected Dog(int dog_Id, String name, String breed, String color, double weight) {
		super();
		this.dog_Id = dog_Id;
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Dog [dog_Id=" + dog_Id + ", name=" + name + ", breed=" + breed + ", color=" + color + ", weight="
				+ weight + "]";
	}

}
