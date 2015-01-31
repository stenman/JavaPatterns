package com.example.patterns.abstractfactory;

public interface VehicleFactory {
	public VSteeringDevice addSteeringDevice();

	public VBrakeDevice addBrakeDevice();

	public VThrottleDevice addThrottleDevice();

	public VTopSpeed addTopSpeed();
}
