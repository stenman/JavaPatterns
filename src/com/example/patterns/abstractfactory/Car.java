package com.example.patterns.abstractfactory;

public class Car extends Vehicle {
	VehicleFactory vehicleFactory;

	public Car(VehicleFactory vehicleFactory) {
		this.vehicleFactory = vehicleFactory;
	}

	@Override
	void makeVehicle() {
		System.out.println("Making vahicle " + getName());

		steeringDevice = vehicleFactory.addSteeringDevice();
		acceleratorDevice = vehicleFactory.addAcceleratorDevice();
		brakeDevice = vehicleFactory.addBrakeDevice();
		topSpeed = vehicleFactory.addTopSpeed();
	}

}
