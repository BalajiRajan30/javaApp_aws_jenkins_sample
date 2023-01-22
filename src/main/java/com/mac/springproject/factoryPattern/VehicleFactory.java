package com.mac.springproject.factoryPattern;

public class VehicleFactory {

	public Vehicle getVehicleFactory(String input)
	{
		if(input.contains("Car"))
		{
			return new Car();
		}
		else if (input.contains("Bike"))
		{
			return new Bike();			
		} else {
			return null;
		}
		
	}
}
