package com.example.patterns.abstractfactory;

public class SailBoatVehicleFactory implements VehicleFactory {

    @Override
    public VSteeringDevice addSteeringDevice() {
        return new VSailBoatSteeringDevice();
    }

    @Override
    public VBrakeDevice addBrakeDevice() {
        return new VSailBoatBrakeDevice();
    }

    @Override
    public VAcceleratorDevice addAcceleratorDevice() {
        return new VSailBoatAcceleratorDevice();
    }

    @Override
    public VTopSpeed addTopSpeed() {
        return new VSailBoatTopSpeed();
    }

}
