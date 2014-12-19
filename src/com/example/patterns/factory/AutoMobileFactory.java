package com.example.patterns.factory;

public class AutoMobileFactory {

	public AutoMobile makeAutoMobile(String vehicleName) {

		AutoMobile autoMobile = null;

		if (vehicleName.equalsIgnoreCase("RaceCar")) {
			autoMobile = new RaceCar();
		} else if (vehicleName.equalsIgnoreCase("MotorCycle")) {
			autoMobile = new MotorCycle();
		} else if (vehicleName.equalsIgnoreCase("Truck")) {
			autoMobile = new Truck();
		} else if (vehicleName.equalsIgnoreCase("Tractor")) {
			autoMobile = new Tractor();
		}

		return autoMobile;
	}
}
