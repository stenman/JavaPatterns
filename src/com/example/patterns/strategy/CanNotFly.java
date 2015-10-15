package com.example.patterns.strategy;

public class CanNotFly implements Flies {

    @Override
    public String fly() {
        return "Sorry, earthbound!";
    }

}
