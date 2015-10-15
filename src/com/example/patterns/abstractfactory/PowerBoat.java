package com.example.patterns.abstractfactory;

public class PowerBoat extends Vehicle {
    VehicleFactory vehicleFactory;

    public PowerBoat(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    @Override
    void makeVehicle() {
        System.out.println("Making vehicle " + getName());

        steeringDevice = vehicleFactory.addSteeringDevice();
        acceleratorDevice = vehicleFactory.addAcceleratorDevice();
        brakeDevice = vehicleFactory.addBrakeDevice();
        topSpeed = vehicleFactory.addTopSpeed();
    }
}
