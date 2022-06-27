package com.xworkz.doggy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.DAO.DogDAOImpl;
import com.xworkz.entity.DogEntity;

public class Tester {

	public static void main(String[] args) {
		
		//dog dg = new dog(3,"i","black","female");
		DogDAOImpl impl = new DogDAOImpl();
		//impl.savedog();
		impl.getDogId(2);
		impl.update();
		impl.delete();
		impl.getDogDetails();
		impl.countDogs();
		impl.maxWeight();
		impl.minWeight();
		impl.avgWeight();
		impl.sumOfWeight();
		impl.nameStartsWith();
		impl.nameEndsWith();
		impl.weightBetweenDogs();
		impl.updateColourByName("Grey","Robert");
		impl.updateNameByWeight(87);
//		impl.insertNewDog();
		impl.deleteByColour("colourless");
		impl.getDogsByGender("female");
		impl.duplicatesByGender();
		impl.getByWeightandId();
		impl.getByNameOrColour();
		impl.dogContainsLetter();
		impl.orderByWeight();
		impl.orderByName();
		impl.orderByIdDesc();
		impl.orderByColourDesc();
		impl.weightGreaterthan();
		impl.weightLesserthan();
	//	impl.findSecondHighest();
		
	}
}
