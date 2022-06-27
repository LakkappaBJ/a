package com.xworkz.service;

import com.xworkz.entity.DogFood;


public  class DogFoodServiceImpl implements DogFoodService {

	@Override
	public boolean validation(DogFood dogFood) {
		// DogFoodDAOImpl dogFoodDAOImpl = new DogFoodDAOImpl();
		boolean flag = false;

		System.out.println("----------SERVICE CLASS----");
		if (dogFood.getName() != null && dogFood.getName().isEmpty() && dogFood.getName().isBlank()) {
			System.out.println("Dog food name is valid");
			flag = true;
		} else {
			System.out.println("Food name is Not valid");
		}
		if (dogFood.getPrice() > 0) {
			System.out.println("valid price");
			flag = true;
		} else {
			System.out.println("food price is not valid");
		}
		if (dogFood.getQuality() != null  && dogFood.getQuality().isEmpty() && dogFood.getQuality().isBlank()) {
			System.out.println("good food quality");
			flag = true;
		} else {
			System.out.println("food quality is not good");
		}
		if (dogFood.getQuantity() != null && dogFood.getQuantity().isBlank() &&dogFood.getQuantity().isEmpty()) {
			System.out.println("valid quantity");
			flag = true;
		} else {
			System.out.println("food quantity is not valid");
		}
	
		return flag;

	}
		
}
