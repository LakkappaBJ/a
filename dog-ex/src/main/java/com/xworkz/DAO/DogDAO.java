package com.xworkz.DAO;

import com.xworkz.doggy.dog;
import com.xworkz.entity.DogEntity;

public interface DogDAO {

	void savedog(DogEntity dogEntity);
	void getDogId(int id);
	void update();
	void delete();
	void getDogDetails();
	void countDogs();
	void maxWeight();
	void minWeight();
	void avgWeight();
	void sumOfWeight();
	void nameStartsWith();
	void nameEndsWith();
	void weightBetweenDogs();
	void updateColourByName(String colour,String name);
	void updateNameByWeight(int weight);
//	void insertNewDog();
	void deleteByColour(String colour);
	void getDogsByGender(String gender);
	void duplicatesByGender();
	void getByWeightandId();
	void getByNameOrColour();
	void dogContainsLetter();
	void orderByWeight();
	void orderByName();
	void orderByIdDesc();
	void orderByColourDesc();
	void weightGreaterthan();
	void weightLesserthan();
	//void findSecondHighest();
	
	
}
