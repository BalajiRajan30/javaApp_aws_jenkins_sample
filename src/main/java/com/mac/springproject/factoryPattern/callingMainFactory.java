package com.mac.springproject.factoryPattern;

public class callingMainFactory {

	public static void main(String[] args) {
		
		String vehicle = "Bike";
		
		VehicleFactory vhf = new VehicleFactory();
		
		 Vehicle vh = vhf.getVehicleFactory(vehicle);
		 
		System.out.println(vh.getType());
		System.out.println(vh.wheels());
		
	}
}
