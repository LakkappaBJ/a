package com.xworkz.codeOptimize;

public class Runner {

	public static void main(String[] args) {
		Laptop lap = new Laptop(2, "HP", 55000);
		LaptopDAOImpl lapDaoImpl = new LaptopDAOImpl();
		lapDaoImpl.saveLap(lap);

	}
}
