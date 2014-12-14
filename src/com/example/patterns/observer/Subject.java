package com.example.patterns.observer;

public interface Subject {
	public void register(Observer o);

	public void unRegister(Observer o);

	public void notifyObservers();

	public void setGasolinePrice(double newGasolinePrice);

	public void setDieselPrice(double newDieselPrice);

	public void setEthanolPrice(double newEthanolPrice);
}
