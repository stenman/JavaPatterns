package com.example.patterns.strategy;

public class Bird extends Animal {
    public Bird() {
        super();
        flyingType = new CanFly();
    }
}
