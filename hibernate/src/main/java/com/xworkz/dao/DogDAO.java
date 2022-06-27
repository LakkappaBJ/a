package com.xworkz.dao;

import com.xworkz.entity.DogDTO;

public interface DogDAO {

	void getDog(int dogId);

	void saveDog(DogDTO dogDto);

	void updateDog(int dogId);

	void deleteDogId();

}
