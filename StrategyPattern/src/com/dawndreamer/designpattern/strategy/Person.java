package com.dawndreamer.designpattern.strategy;

public class Person {
	private TravelStrategy travelStrategy;
	private static TravelStrategy defaultStrategy = new AirplaneStrategy();
	public Person(){
		this(defaultStrategy);
	}
	
	public Person(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}

	public TravelStrategy getTravelStrategy() {
		return travelStrategy;
	}

	public void setTravelStrategy(TravelStrategy travelStrategy) {
		this.travelStrategy = travelStrategy;
	}
	
	public void travel(){
		travelStrategy.travel();
	}
}
