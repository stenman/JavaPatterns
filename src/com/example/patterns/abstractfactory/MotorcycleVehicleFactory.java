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
    public VAcceleratorDevice addAcceleratorDevice() {
        return new VMotorcycleAcceleratorDevice();
    }

    @Override
    public VTopSpeed addTopSpeed() {
        return new VMotorcycleTopSpeed();
    }

}
