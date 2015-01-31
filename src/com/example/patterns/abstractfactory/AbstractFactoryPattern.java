package com.example.patterns.abstractfactory;

public class AbstractFactoryPattern {

	public static void main(String[] args) {
		VehicleBuilding MakeLandVehicles = new LandVehicleBuilding();

		Vehicle v70 = MakeLandVehicles.makeVehicle("Car");
		System.out.println(v70 + "\n");

		Vehicle ducati = MakeLandVehicles.makeVehicle("Motorcycle");
		System.out.println(ducati + "\n");
	}

}
