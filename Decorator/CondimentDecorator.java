package com.algonquin.cst8288.DecoratorPractice.Decorator;

import com.algonquin.cst8288.DecoratorPractice.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage{
	protected Beverage beverage;
	
	public abstract String getDescription();
}
