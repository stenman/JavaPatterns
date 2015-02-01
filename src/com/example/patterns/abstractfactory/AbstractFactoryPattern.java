package com.example.patterns.abstractfactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		VehicleBuilding MakeLandVehicles = new LandVehicleBuilding();

		Vehicle car = MakeLandVehicles.makeVehicle("Car");
		System.out.println(car + "\n");

		Vehicle motorcycle = MakeLandVehicles.makeVehicle("Motorcycle");
		System.out.println(motorcycle + "\n");
	}

}
