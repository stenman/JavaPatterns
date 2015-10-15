package com.example.patterns.observerusingthreads;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class GetTheStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private StockGrabber stockGrabber;

    public GetTheStock(StockGrabber stockGrabber, int newStartTime, String newStock, double newPrice) {
        this.stockGrabber = stockGrabber;
        this.startTime = newStartTime;
        this.stock = newStock;
        this.price = newPrice;
    }

    @Override
    public void run() {
        for (int i = 1; i < 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // handle this exception
            }

            double randNum = (Math.random() * (.06)) - .03;

            NumberFormat nf = NumberFormat.getNumberInstance(Locale.ENGLISH);
            DecimalFormat df = (DecimalFormat) nf;
            df.applyPattern("#.##");
            String newPrice = df.format((price + randNum));

            price = Double.valueOf(newPrice);

            if (stock == "IBM") {
                stockGrabber.setIBMPrice(price);
            }
            if (stock == "GOOG") {
                stockGrabber.setGOOGPrice(price);
            }
            if (stock == "AAPL") {
                stockGrabber.setAAPLPrice(price);
            }

            System.out.println("Threaded execution: " + stock + ": " + df.format((price)) + " (" + df.format(randNum) + ")");
        }
    }
}
