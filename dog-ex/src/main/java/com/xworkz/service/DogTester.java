package com.xworkz.service;

import com.xworkz.DAO.DogDAO;
import com.xworkz.DAO.DogDAOImpl;
import com.xworkz.Exception.DogException;
import com.xworkz.entity.DogEntity;

public class DogTester {
	
	public static void validate() throws DogException {
	//	DogEntity dog = new DogEntity(12,"manoj", "yellow",null);
		DogEntity entity  = new DogEntity(7,"unknown", "colourless", "female",25);
		DogService dd = new DogServiceImpl();

		boolean outcome = dd.validateDogEntity(entity);
		System.out.println(outcome);
		if(outcome) {
			DogDAO db = new DogDAOImpl();
			db.savedog(entity);	
		}
		else {
			System.out.println("Dog is not valid...............try again");
		}
	}
public static void main(String[] args) {
	

	try {
		DogTester.validate();
	} catch (DogException e) {
System.out.println(e.getMessage());
	}
	
 }
}
