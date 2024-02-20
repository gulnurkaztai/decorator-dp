package com.algonquin.cst8288.DecoratorPractice.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "Coffee";
	}
	
	public String getDescription() {
		return super.getDescription();
	}

	@Override
	public double cost() {
		return 2.5;
	}

}
