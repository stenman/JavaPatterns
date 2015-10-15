package com.example.patterns.strategy;

public class Cat extends Animal {
    public Cat() {
        super();
        flyingType = new CanNotFly();
    }
}
