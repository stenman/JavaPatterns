package com.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class FuelPriceGrabber implements Subject {

	private double gasoline;
	private double diesel;
	private double ethanol;

	private List<Observer> observers;

	public FuelPriceGrabber() {
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
			observer.update(gasoline, diesel, ethanol);
		}
	}

	public void setGasolinePrice(double newGasolinePrice) {
		this.gasoline = newGasolinePrice;
		notifyObservers();
	}

	public void setDieselPrice(double newDieselPrice) {
		this.diesel = newDieselPrice;
		notifyObservers();
	}

	public void setEthanolPrice(double newEthanolPrice) {
		this.ethanol = newEthanolPrice;
		notifyObservers();
	}

}
