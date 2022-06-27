package com.xworkz.dog.dao;

import com.xworkz.dog.entity.DogEntity;

public interface DogDAO {
	/*
	public static void main(String[] args) {
		
	}
	default void add() {
	}
	*/
	
	void saveDogDAO(DogEntity  dogEntity);
	
	void getDogById(int dogID);
	
	void updateDogEntity();
	
	void deleteDogEntity();
}
