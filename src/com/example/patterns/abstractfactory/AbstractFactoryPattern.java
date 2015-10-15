package com.example.patterns.abstractfactory;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        VehicleBuilding makeLandVehicles = new LandVehicleBuilding();
        VehicleBuilding makeWaterVehicles = new WaterVehicleBuilding();

        Vehicle car = makeLandVehicles.orderTheVehicle("Car");
        System.out.println(car + "\n");

        Vehicle motorcycle = makeLandVehicles.orderTheVehicle("Motorcycle");
        System.out.println(motorcycle + "\n");

        Vehicle powerBoat = makeWaterVehicles.orderTheVehicle("PowerBoat");
        System.out.println(powerBoat + "\n");

        Vehicle sailBoat = makeWaterVehicles.orderTheVehicle("SailBoat");
        System.out.println(sailBoat + "\n");
    }

}
