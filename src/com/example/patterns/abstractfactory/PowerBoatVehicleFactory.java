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
	public VAcceleratorDevice addAcceleratorDevice() {
		return new VPowerBoatAcceleratorDevice();
	}

	@Override
	public VTopSpeed addTopSpeed() {
		return new VPowerBoatTopSpeed();
	}

}
