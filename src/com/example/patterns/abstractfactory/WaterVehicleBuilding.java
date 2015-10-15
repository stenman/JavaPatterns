package com.example.patterns.abstractfactory;

public class WaterVehicleBuilding extends VehicleBuilding {

    @Override
    protected Vehicle makeVehicle(String typeOfVehicle) {
        Vehicle theVehicle = null;

        if (typeOfVehicle.equals("PowerBoat")) {
            VehicleFactory vehiclePartsFactory = new PowerBoatVehicleFactory();
            theVehicle = new PowerBoat(vehiclePartsFactory);
            theVehicle.setName("Frauscher 1017GT");
        } else if (typeOfVehicle.equals("SailBoat")) {
            VehicleFactory vehiclePartsFactory = new SailBoatVehicleFactory();
            theVehicle = new SailBoat(vehiclePartsFactory);
            theVehicle.setName("Dehler 38");
        }

        return theVehicle;
    }

}
