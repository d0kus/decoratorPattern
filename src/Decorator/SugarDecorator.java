package Decorator;

import Coffee.Coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription(){
        return wrappee.getDescription() + " + Sugar";
    }

    @Override
    public double getCost(){
        return wrappee.getCost() + 0.20;
    }
}
