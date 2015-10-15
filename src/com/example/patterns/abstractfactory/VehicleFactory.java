package com.example.patterns.abstractfactory;

public interface VehicleFactory {
    public VSteeringDevice addSteeringDevice();

    public VBrakeDevice addBrakeDevice();

    public VAcceleratorDevice addAcceleratorDevice();

    public VTopSpeed addTopSpeed();
}
