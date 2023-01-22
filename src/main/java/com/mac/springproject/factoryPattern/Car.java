package com.mac.springproject.factoryPattern;

public class Car implements Vehicle {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Car";
	}

	@Override
	public String wheels() {
		// TODO Auto-generated method stub
		return "4";
	}

}
