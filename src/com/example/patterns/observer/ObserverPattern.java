package com.example.patterns.observer;

public class ObserverPattern {

	public static void main(String[] args) {

		FuelPriceGrabber fuelPriceGrabber = new FuelPriceGrabber();

		Observer fuelPriceObserver1 = new FuelPriceObserver(fuelPriceGrabber);

		fuelPriceGrabber.setGasolinePrice(13.37);
		fuelPriceGrabber.setDieselPrice(13.16);
		fuelPriceGrabber.setEthanolPrice(10.07);

		Observer fuelPriceObserver2 = new FuelPriceObserver(fuelPriceGrabber);
		
		fuelPriceGrabber.setGasolinePrice(13.56);
		fuelPriceGrabber.setDieselPrice(13.46);
		fuelPriceGrabber.setEthanolPrice(10.44);
		
		fuelPriceGrabber.unRegister(fuelPriceObserver1);
		
		fuelPriceGrabber.setGasolinePrice(13.86);
		fuelPriceGrabber.setDieselPrice(13.73);
		fuelPriceGrabber.setEthanolPrice(10.94);
	}

}
