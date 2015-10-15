package com.example.patterns.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        Animal sally = new Cat();
        Animal polly = new Bird();

        System.out.println("Cat: " + sally.tryToFly());
        System.out.println("Bird: " + polly.tryToFly());

        sally.setFlyingAbility(new CanFly());

        System.out.println("Improved cat: " + sally.tryToFly());
    }
}
