package com.example.patterns.observerusingthreads;

public class StockObserver implements Observer {

	private double ibmPrice;
	private double googPrice;
	private double aaplPrice;

	Subject stockGrabber;

	private static int observerIdTracker = 0;
	private int observerId;

	public StockObserver(Subject subject) {
		this.stockGrabber = subject;
		this.observerId = ++observerIdTracker;
		System.out.println("New Observer: " + this.observerId);
		stockGrabber.register(this);
	}

	@Override
	public void update(double ibmPrice, double googPrice, double aaplPrice) {
		this.ibmPrice = ibmPrice;
		this.googPrice = googPrice;
		this.aaplPrice = aaplPrice;

		printUpdatedFuelPrices();
	}

	private void printUpdatedFuelPrices() {
		System.out.println(observerId + "\nIBM: " + ibmPrice + "\nGOOG: " + googPrice + "\nAAPL: " + aaplPrice + "\n");
		System.out.println();
	}

}
