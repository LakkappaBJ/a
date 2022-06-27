package com.xworkz.runner;

import com.xworkz.dao.DogFoodDAO;
import com.xworkz.dao.DogFoodDAOImpl;
import com.xworkz.entity.DogFood;
import com.xworkz.service.DogFoodService;
import com.xworkz.service.DogFoodServiceImpl;

public class DogFoodRunner {

	public static void main(String[] args) {
		
		//long startTime = System.currentTimeMillis();
		
		// TODO Auto-generated method stub
		DogFood dogFood = new DogFood(null, 360, "aftdgfg", "6kg");
		DogFoodService dogFoodService = new DogFoodServiceImpl();
		boolean val = dogFoodService.validation(dogFood);


		System.out.println("------------RUNNER CLASS--------");
		if (val) {
			DogFoodDAOImpl dogFoodDAOImpl = new DogFoodDAOImpl();
			dogFoodDAOImpl.saveDogFood(dogFood);
			//dogFoodDAOImpl.getDogFoodByPrice(1000);
			System.out.println("DATA SAVED SUCCESSFULLY!!!!!!!!!!!!!!!!");
		} else {
			System.out.println("THIS IS NOT VALID PROGRAM");
		}
		
		
		
		//long endTime=System.currentTimeMillis();

		//System.out.println((endTime-startTime)/1000.0+"secs");

	}

}
