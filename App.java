package com.algonquin.cst8288.DecoratorPractice;

import com.algonquin.cst8288.DecoratorPractice.Beverage.Beverage;
import com.algonquin.cst8288.DecoratorPractice.Beverage.Decaf;
import com.algonquin.cst8288.DecoratorPractice.Decorator.Milk;

public class App {
  public static void main(String[] args) {
	  
	  Beverage coffee = new Decaf();
	  coffee = new Milk(coffee);
	  
    System.out.println(coffee.getDescription());
    System.out.println(coffee.cost());
  }
}
