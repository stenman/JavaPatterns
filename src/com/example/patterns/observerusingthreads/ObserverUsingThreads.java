package com.example.patterns.observerusingthreads;

public class ObserverUsingThreads {

	public static void main(String args[]) {
		Subject stockGrabber = new StockGrabber();

		Observer stockObserver1 = new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setGOOGPrice(677.60);
		stockGrabber.setAAPLPrice(676.40);

		Observer stockObserver2 = new StockObserver(stockGrabber);

		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setGOOGPrice(677.60);
		stockGrabber.setAAPLPrice(676.40);

		stockGrabber.unRegister(stockObserver1);

		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setGOOGPrice(677.60);
		stockGrabber.setAAPLPrice(676.40);

		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 197.00);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 197.00);

		new Thread(getIBM).start();
		new Thread(getGOOG).start();
		new Thread(getAAPL).start();

	}
}
