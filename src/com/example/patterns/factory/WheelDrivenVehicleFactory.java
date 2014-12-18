package com.example.patterns.factory;

public class WheelDrivenVehicleFactory {

	public WheelDrivenVehicle makeWheelDrivenVehicle(String vehicleName) {

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
