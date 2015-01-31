package com.example.patterns.abstractfactory;

public class LandVehicleBuilding extends VehicleBuilding {

	@Override
	protected Vehicle makeVehicle(String typeOfVehicle) {

		Vehicle theVehicle = null;

		if (typeOfVehicle.equals("Car")) {
			VehicleFactory vehiclePartsFactory = new CarVehicleFactory();
			theVehicle = new Car(vehiclePartsFactory);
			theVehicle.setName("Volvo V70");
		} else if (typeOfVehicle.equals("Motorcycle")) {
			VehicleFactory vehiclePartsFactory = new MotorcycleVehicleFactory();
			theVehicle = new Motorcycle(vehiclePartsFactory);
			theVehicle.setName("Ducati");
		}

		return theVehicle;
	}

}
