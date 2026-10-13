package Decorator;

import Coffee.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee wrappee;

    public CoffeeDecorator(Coffee coffee){
        this.wrappee = coffee;
    }

    @Override
    public String getDescription(){
        return wrappee.getDescription();
    }

    @Override
    public double getCost(){
        return wrappee.getCost();
    }
}
