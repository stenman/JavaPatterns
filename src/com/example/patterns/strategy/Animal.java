package com.example.patterns.strategy;

public abstract class Animal {

	protected Flies flyingType;
	
	public String tryToFly(){
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flies flybehaviour){
		this.flyingType = flybehaviour;
	}
	
	
}
