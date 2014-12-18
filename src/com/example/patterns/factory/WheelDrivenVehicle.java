package com.example.patterns.factory;

public abstract class WheelDrivenVehicle {
	private String name;
	private int maxSpeedInKmh;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxSpeedInKmh() {
		return maxSpeedInKmh;
	}

	public void setMaxSpeedInKmh(int maxSpeed) {
		this.maxSpeedInKmh = maxSpeed;
	}

	public void accelerateToMaxSpeed() {
		System.out.println(getName() + " accelerates to " + getMaxSpeedInKmh() + "km/h.");
	}

	public void brake() {
		System.out.println(getName() + " breaks to a full stop.");
	}

}
