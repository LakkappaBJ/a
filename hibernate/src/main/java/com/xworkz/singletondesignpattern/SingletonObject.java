package com.xworkz.singletondesignpattern;

public class SingletonObject {
	public static SingletonObject instance = new SingletonObject();

	private SingletonObject() {

	}

	public static SingletonObject getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("this is singleton design pattern");
	}
}
