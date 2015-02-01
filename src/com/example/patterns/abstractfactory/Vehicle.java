package com.example.patterns.abstractfactory;

public abstract class Vehicle {
	private String name;

	VBrakeDevice brakeDevice;
	VSteeringDevice steeringDevice;
	VAcceleratorDevice acceleratorDevice;
	VTopSpeed topSpeed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	abstract void makeVehicle();

	public void fullThrottle() {
		System.out.println("The " + getName() + " is accelerates by using " + acceleratorDevice + " and reached the top speed of " + topSpeed + ".");
	}

	public void makeUTurn() {
		System.out.println("The " + getName() + " uses its " + steeringDevice + " and makes a U-turn.");
	}

	public void stop() {
		System.out.println("The " + getName() + " uses " + brakeDevice + " and halts to a full stop.");
	}

	public String toString() {
		String infoOnVehicle = "The " + name + " has a top speed of " + topSpeed + ", uses " + acceleratorDevice + " as accelerator device and uses "
				+ steeringDevice + " as steering device.";
		return infoOnVehicle;
	}
}
