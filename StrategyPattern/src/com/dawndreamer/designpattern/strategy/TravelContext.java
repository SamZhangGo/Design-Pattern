package com.dawndreamer.designpattern.strategy;

public class TravelContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.travel();
		person.setTravelStrategy(new WalkStrategy());
		person.travel();
		person.setTravelStrategy(new TrainStrategy());
		person.travel();
		person.setTravelStrategy(new BicycleStrategy());
		person.travel();
	}

}
