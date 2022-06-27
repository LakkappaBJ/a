package com.xworkz.dog.service;

import com.xworkz.dog.entity.DogEntity;
import com.xworkz.dog.exception.DogException;

public interface DogService {

	boolean validateDogEntity(DogEntity  dogEntity)throws DogException;
}
