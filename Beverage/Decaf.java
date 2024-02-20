package com.algonquin.cst8288.DecoratorPractice.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		this.description = "Decaf Coffee";
	}
	
	public String getDescription() {
		return super.getDescription();
	}

	@Override
	public double cost() {
		return 2.0;
	}

}
