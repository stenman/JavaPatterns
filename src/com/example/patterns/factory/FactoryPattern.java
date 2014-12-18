package com.example.patterns.factory;

import java.util.Scanner;

public class FactoryPattern {

	public static void main(String[] args) {

		WheelDrivenVehicleFactory wheelDrivenVehicleFactory = new WheelDrivenVehicleFactory();

		WheelDrivenVehicle vehicle = null;

		Scanner userInput = new Scanner(System.in);

		System.out.println("Select vehicle (racecar, motorcycle, truck or tractor)\nPress q to quit");

		String typeOfVehicle = null;

		while (true) {
			typeOfVehicle = userInput.nextLine();

			if (typeOfVehicle.equals("q")) {
				System.out.println("Thank you for using Wheel Driven Vehicle Factory 4000!");
				break;
			}

			vehicle = wheelDrivenVehicleFactory.makeWheelDrivenVehicle(typeOfVehicle);

			if (vehicle != null) {
				doStuffVehicle(vehicle);
			} else {
				System.out.println("Next time, select one of these vehicles: racecar, motorcycle, truck or tractor.");
			}
		}
	}

	public static void doStuffVehicle(WheelDrivenVehicle vehicle) {
		vehicle.accelerateToMaxSpeed();
		vehicle.brake();
	}
}
