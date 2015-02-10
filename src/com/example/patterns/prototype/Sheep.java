package com.example.patterns.prototype;

public class Sheep implements Animal {

	public Sheep() {
		System.out.println("A sheep was made");
	}

	@Override
	public Animal makeClone() {

		System.out.println("Making sheep clone");

		Sheep clone = null;

		try {
			clone = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

	public String saySomething() {
		return "Yay! I'm a sheep!";
	}

}
