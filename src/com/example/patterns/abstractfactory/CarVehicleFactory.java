package com.example.patterns.abstractfactory;

public class CarVehicleFactory implements VehicleFactory {

	@Override
	public VSteeringDevice addSteeringDevice() {
		return new VCarSteeringDevice();
	}

	@Override
	public VBrakeDevice addBrakeDevice() {
		return new VCarBrakeDevice();
	}

	@Override
	public VThrottleDevice addThrottleDevice() {
		return new VCarThrottleDevice();
	}

	@Override
	public VTopSpeed addTopSpeed() {
		return new VCarTopSpeed();
	}

}
