package com.example.patterns.abstractfactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		VehicleBuilding MakeLandVehicles = new LandVehicleBuilding();

		Vehicle car = MakeLandVehicles.orderTheVehicle("Car");
		System.out.println(car + "\n");

		Vehicle motorcycle = MakeLandVehicles.orderTheVehicle("Motorcycle");
		System.out.println(motorcycle + "\n");
	}

}
