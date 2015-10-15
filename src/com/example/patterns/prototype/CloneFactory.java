package com.example.patterns.prototype;

public class CloneFactory {

    public Animal getClone(Animal animalSample) {
        return animalSample.makeClone();
    }
}
