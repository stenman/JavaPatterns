package com.example.patterns.abstractfactory;

public class MotorcycleVehicleFactory implements VehicleFactory {

	@Override
	public VSteeringDevice addSteeringDevice() {
		return new VMotorcycleSteeringDevice();
	}

	@Override
	public VBrakeDevice addBrakeDevice() {
		return new VMotorcycleBrakeDevice();
	}

	@Override
	public VThrottleDevice addThrottleDevice() {
		return new VMotorcycleThrottleDevice();
	}

	@Override
	public VTopSpeed addTopSpeed() {
		return new VMotorcycleTopSpeed();
	}

}
