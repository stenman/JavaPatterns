package com.example.patterns.abstractfactory;

public class Motorcycle extends Vehicle {
	VehicleFactory vehicleFactory;

	public Motorcycle(VehicleFactory vehicleFactory) {
		this.vehicleFactory = vehicleFactory;
	}

	@Override
	void makeVehicle() {
		System.out.println("Making vahicle " + getName());

		steeringDevice = vehicleFactory.addSteeringDevice();
		throttleDevice = vehicleFactory.addThrottleDevice();
		brakeDevice = vehicleFactory.addBrakeDevice();
		topSpeed = vehicleFactory.addTopSpeed();
	}
}
