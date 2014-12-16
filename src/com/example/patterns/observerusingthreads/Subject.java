package com.example.patterns.observerusingthreads;

public interface Subject {
	public void register(Observer o);

	public void unRegister(Observer o);

	public void notifyObservers();
}
