package com.xworkz.dog.dao;


import com.xworkz.dog.entity.DogEntity;
import com.xworkz.dog.exception.DogException;
import com.xworkz.dog.service.DogService;
import com.xworkz.dog.service.DogServiceImpl;

public class DogTester {

	public static void main(String[] args) {
	
		testingDogEntity();
		
	}

		public static void testingDogEntity() {
		DogEntity dogEntity=new DogEntity(7," charli","Male"," pub"," ",400);
		DogService dogService =new DogServiceImpl();
		boolean outcome;
		try {
			outcome = dogService.validateDogEntity(dogEntity);
			System.out.println(outcome);
			if(outcome) {
				DogDAO dogDAO=new DogDAOImpl();
				dogDAO.saveDogDAO(dogEntity);
				//dogDAO.getDogById(2);
				//dogDAO.updateDogEntity();
				dogDAO.deleteDogEntity();
			}else {
				System.out.println("Invalid Data....please try again");
			}
			} catch (DogException e) {
			e.printStackTrace();
		}
	}	
}