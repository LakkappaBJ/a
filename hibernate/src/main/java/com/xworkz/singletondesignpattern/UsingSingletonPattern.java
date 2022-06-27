package com.xworkz.singletondesignpattern;
//invoking singleton design pattern 
public class UsingSingletonPattern {
 
	public static void main(String[] args) {
		SingletonObject obj = SingletonObject.getInstance();
		obj.showMessage();
	}

}
