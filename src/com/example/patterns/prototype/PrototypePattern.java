package com.example.patterns.prototype;

public class PrototypePattern {

	public static void main(String args[]) {
		CloneFactory cloneFactory = new CloneFactory();

		Sheep aSheep = new Sheep();
		Sheep aSheepClone = (Sheep) cloneFactory.getClone(aSheep);
		System.out.println(aSheep.saySomething());
		System.out.println(aSheepClone.saySomething());
		System.out.println("aSheep hashcode: " + System.identityHashCode(aSheep));
		System.out.println("aSheepClone hashcode: " + System.identityHashCode(aSheepClone));

		System.out.println("\n");

		Dog aDog = new Dog();
		Dog aDogClone = (Dog) cloneFactory.getClone(aDog);
		System.out.println(aDog.saySomething());
		System.out.println(aDogClone.saySomething());
		System.out.println("aDog hashcode: " + System.identityHashCode(aDog));
		System.out.println("aDogClone hashcode: " + System.identityHashCode(aDogClone));
	}
}
