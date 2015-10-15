package com.example.patterns.abstractfactory;

public abstract class VehicleBuilding {

    protected abstract Vehicle makeVehicle(String typeOfVehicle);

    public Vehicle orderTheVehicle(String typeOfVehicle) {
        Vehicle theVehicle = makeVehicle(typeOfVehicle);

        theVehicle.makeVehicle();
        theVehicle.fullThrottle();
        theVehicle.makeUTurn();
        theVehicle.stop();

        return theVehicle;
    }
}
