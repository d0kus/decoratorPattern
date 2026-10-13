package Decorator;

import Coffee.Coffee;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return wrappee.getDescription() + " + Milk";
    }

    @Override
    public double getCost(){
        return wrappee.getCost() + 0.50;
    }
}
