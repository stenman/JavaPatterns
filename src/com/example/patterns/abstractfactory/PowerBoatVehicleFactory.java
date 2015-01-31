package com.example.patterns.abstractfactory;

public class PowerBoatVehicleFactory implements VehicleFactory {

	@Override
	public VSteeringDevice addSteeringDevice() {
		return new VPowerBoatSteeringDevice();
	}

	@Override
	public VBrakeDevice addBrakeDevice() {
		return new VPowerBoatBrakeDevice();
	}

	@Override
	public VThrottleDevice addThrottleDevice() {
		return new VPowerBoatThrottleDevice();
	}

	@Override
	public VTopSpeed addTopSpeed() {
		return new VPowerBoatTopSpeed();
	}

}
