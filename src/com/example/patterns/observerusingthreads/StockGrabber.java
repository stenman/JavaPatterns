package com.example.patterns.observerusingthreads;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {

	private double ibmPrice;
	private double googPrice;
	private double aaplPrice;

	private List<Observer> observers;

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {
		observers.add(o);
	}

	@Override
	public void unRegister(Observer o) {
		int observerIndex = observers.indexOf(o);
		observers.remove(observerIndex);
		System.out.println("Unregistered observer " + (observerIndex + 1));
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, googPrice, aaplPrice);
		}
	}

	@Override
	public void setIBMPrice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice;
		notifyObservers();
	}

	@Override
	public void setGOOGPrice(double newGOOGPrice) {
		this.googPrice = newGOOGPrice;
		notifyObservers();
	}

	@Override
	public void setAAPLPrice(double newAAPLPrice) {
		this.aaplPrice = newAAPLPrice;
		notifyObservers();
	}

}
