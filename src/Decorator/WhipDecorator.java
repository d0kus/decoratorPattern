package Decorator;

import Coffee.Coffee;

public class WhipDecorator extends CoffeeDecorator {
    public WhipDecorator(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return wrappee.getDescription() + " + Whip";
    }
    @Override
    public double getCost() {
        return wrappee.getCost() + 0.70;
    }
}
