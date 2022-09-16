package com.epicode.incendi.subject;

import java.util.ArrayList;
import java.util.List;

import com.epicode.incendi.listeners.Observer;

public abstract class Subject {

	private List<Observer> listObs = new ArrayList<>();
	
	public void subscribe(Observer obs) {
		listObs.add(obs);
	}

	public void unsubscribe(Observer obs) {
		listObs.remove(obs);
	}
	
	public void notifyObserver() {
		for (Observer o : listObs ) {
			o.update(this);
		}
	}
}
