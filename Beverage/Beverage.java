package com.algonquin.cst8288.DecoratorPractice.Beverage;

public abstract class Beverage {
	String description="";

	public String getDescription() {
		return this.description;
	};
	public abstract double cost();

}
