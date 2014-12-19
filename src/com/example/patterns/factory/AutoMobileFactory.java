package com.example.patterns.factory;

public class AutoMobileFactory {

	public AutoMobile makeAutoMobile(String vehicleName) {

		if (vehicleName.equalsIgnoreCase("RaceCar")) {
			return new RaceCar();
		} else if (vehicleName.equalsIgnoreCase("MotorCycle")) {
			return new MotorCycle();
		} else if (vehicleName.equalsIgnoreCase("Truck")) {
			return new Truck();
		} else if (vehicleName.equalsIgnoreCase("Tractor")) {
			return new Tractor();
		}
		return null;
	}
}
