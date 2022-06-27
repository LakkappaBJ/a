package com.xworkz.dog.entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="dog_table")
@Entity
public class DogEntity {

	@Column(name="DOG_ID")
	@Id
	@SequenceGenerator(name="x")
//	@GeneratedValue( strategy=GenerationType.SEQUENCE,generator="x")
//	@SequenceGenerator(name="x",sequenceName="sequence")
//	@GeneratedValue( strategy=GenerationType.AUTO)
	private int dogId;
	
	@Column(name="DOG_NAME")
	private String dogName;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="BREED")
	private String breed;
	
	@Column(name="COLOR")
	private String color;
	
	@Column(name="WEIGHT")
	private double weight;
	
	
	public DogEntity() {
		
	}
	public DogEntity(int dogId, String dogName, String gender, String breed, String color, double weight) {
		super();
		this.dogId = dogId;
		this.dogName = dogName;
		this.gender = gender;
		this.breed = breed;
		this.color = color;
		this.weight = weight;
	}

	public int getDogId() {
		return dogId;
	}

	public void setDogId(int dogId) {
		this.dogId = dogId;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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

	@Override
	public String toString() {
		return "Dog [dogId=" + dogId + ", dogName=" + dogName + ", gender=" + gender + ", breed=" + breed + ", color="
				+ color + ", weight=" + weight + "]";
	}		
}
