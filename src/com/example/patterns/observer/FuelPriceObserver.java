package com.example.patterns.observer;

public class FuelPriceObserver implements Observer {

	private double gasoline;
	private double diesel;
	private double ethanol;

	private Subject fuelPriceGrabber;

	private static int observerIdTracker = 0;
	private int observerId;

	public FuelPriceObserver(Subject subject) {
		this.fuelPriceGrabber = subject;
		this.observerId = ++observerIdTracker;
		System.out.println("New Observer: " + this.observerId);
		fuelPriceGrabber.register(this);
	}

	@Override
	public void update(double gasoline, double diesel, double ethanol) {
		this.gasoline = gasoline;
		this.diesel = diesel;
		this.ethanol = ethanol;

		printUpdatedFuelPrices();
	}

	private void printUpdatedFuelPrices() {
		System.out.println(observerId + " Gasoline: " + gasoline);
		System.out.println(observerId + " Diesel: " + diesel);
		System.out.println(observerId + " Ethanol: " + ethanol);
	}

}
