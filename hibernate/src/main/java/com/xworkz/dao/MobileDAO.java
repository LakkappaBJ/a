package com.xworkz.dao;

import com.xworkz.entity.MobileEntity;

public interface MobileDAO {
	void addMobiles();

	void getMobile();

	void updateByName(String name);

	void deleteByName(MobileEntity mobileEntity);

	void getMobileDetails();

	void countMobiles();

	void minBatteryCapacity();

	void maxMemory();

	void avgMobId();

	void secondHighestMemrory();
	void updateByMemory(String memory,String BatteryCapacity);

}
