package com.xworkz.dog.service;

import com.xworkz.dog.entity.DogEntity;
import com.xworkz.dog.exception.DogException;
import com.xworkz.dog.exception.InvalidDogBreedException;
import com.xworkz.dog.exception.InvalidDogColorException;
import com.xworkz.dog.exception.InvalidDogGenderException;
import com.xworkz.dog.exception.InvalidDogNameException;
import com.xworkz.dog.exception.InvalidDogweightException;

public class DogServiceImpl implements DogService {

	@Override
	public boolean validateDogEntity(DogEntity dogEntity)throws DogException{
		System.out.println("Invoked validateDogEntity()");

		boolean flag = false;
		if (dogEntity.getDogName() != null && !dogEntity.getDogName().isBlank() && !dogEntity.getDogName().isEmpty()) {
			flag = true;
			System.out.println("Valid getDogName");
		} else {
			flag = false;
			System.out.println("Invalid getDogName");
			throw new  InvalidDogNameException("Invalid DogName Exception");
			//return flag;
		}
		

		if (dogEntity.getGender() != null && !dogEntity.getGender().isBlank() && !dogEntity.getGender().isEmpty()) {
			flag = true;
			System.out.println("Valid getGender");

		} else {
			flag = false;
			System.out.println("Invalid getGender");
			throw new InvalidDogGenderException("Invalid DogGender Exception");
			//return flag;
		}
		

		if (dogEntity.getBreed() != null && !dogEntity.getBreed().isBlank() && !dogEntity.getBreed().isEmpty()) {
			flag = true;
			System.out.println("Valid getBreed");

		} else {
			flag = false;
			System.out.println("Invalid getBreed");
			throw new InvalidDogBreedException("Invalid Dog BreedException");
			//return flag;
		}
		

		if (dogEntity.getColor() != null && !dogEntity.getColor().isBlank() && !dogEntity.getColor().isEmpty()) {
			flag = true;
			System.out.println("Valid getColor");

		} else {
			flag = false;
			System.out.println("Invalid getColor");
			throw new InvalidDogColorException("Invalid DogColor Exception");
			//return flag;
		}

		
		if (dogEntity.getWeight() > 0) {
			flag = true;
			System.out.println("Valid getWeight");
		} else {
			flag = false;
			System.out.println("Invalid getWeight");
			throw new InvalidDogweightException("Invalid Dogweight Exception");
			//return flag;
		}
		return flag;
		}
	}
