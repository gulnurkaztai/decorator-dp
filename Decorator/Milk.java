package com.algonquin.cst8288.DecoratorPractice.Decorator;

import com.algonquin.cst8288.DecoratorPractice.Beverage.Beverage;

public class Milk extends CondimentDecorator {

	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return this.beverage.getDescription() + " \nadd milk";
	}

	public double cost() {
		return this.beverage.cost() + 0.5;
	}

}
