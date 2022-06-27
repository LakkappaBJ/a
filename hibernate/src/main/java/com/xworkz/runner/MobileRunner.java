package com.xworkz.runner;

import com.xworkz.dao.MobileDAOImpl;

public class MobileRunner {

	public static void main(String[] args) {
		// MobileEntity mobileEntity = new MobileEntity();
		MobileDAOImpl mobileDAOImpl = new MobileDAOImpl();
		System.out.println("Ruuner class");
		// mobileDAOImpl.addMobiles();
		// mobileDAOImpl.getMobile();
		// mobileDAOImpl.updateByName("");
		// mobileDAOImpl.deleteByName(mobileEntity);
//		 mobileDAOImpl.getMobileDetails();
//		 mobileDAOImpl.countMobiles();
//		 mobileDAOImpl.minBatteryCapacity();
//		 mobileDAOImpl.maxMemory();
//		mobileDAOImpl.avgMobId();
//		mobileDAOImpl.secondHighestMemrory();
		
		//MobileDAOImpl.MobileDAOImplSQL obj=new MobileDAOImpl.MobileDAOImplSQL();   error
		
		mobileDAOImpl.updateByMemory("1024GB", "4500mh");
		// MobileDAOImplSQL implSQL = new MobileDAOImplSQL();

		// implSQL.updateByMemory("8GB","4500mh");

	}

}
