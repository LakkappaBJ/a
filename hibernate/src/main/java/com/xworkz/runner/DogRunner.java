package com.xworkz.runner;

import com.xworkz.dao.DogDAOImpl;
import com.xworkz.entity.DogDTO;

public class DogRunner {
	public static void main(String args[]) {
		DogDTO dogDTO = new DogDTO(1, null, null);
		DogDAOImpl dogDAOImpl = new DogDAOImpl();
		 dogDAOImpl.saveDog(dogDTO);
		// dogDAOImpl.getDog(103);
		//dogDAOImpl.updateDog(103);

	}
}
