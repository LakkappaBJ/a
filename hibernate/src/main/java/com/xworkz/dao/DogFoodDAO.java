package com.xworkz.dao;

import com.xworkz.entity.DogFood;

public interface DogFoodDAO {
void saveDogFood(DogFood dogFood);
void getDogFoodByPrice(double price);
}
