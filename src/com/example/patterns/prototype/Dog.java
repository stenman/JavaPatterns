package com.example.patterns.prototype;

public class Dog implements Animal {

    public Dog() {
        System.out.println("A dog was made");
    }

    @Override
    public Animal makeClone() {

        System.out.println("Making dog clone");

        Dog clone = null;

        try {
            clone = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    public String saySomething() {
        return "Yay! I'm a dog!";
    }

}
