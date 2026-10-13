package Decorator;

import Coffee.Coffee;

public class SyrupDecorator extends CoffeeDecorator {
    private final String flavor;
    public SyrupDecorator(Coffee coffee, String flavor) {
        super(coffee);
        this.flavor = flavor;
    }
    @Override
    public String getDescription() {
        return wrappee.getDescription() + " + Syrup (" + flavor + ")";
    }
    @Override
    public double getCost() {
        return wrappee.getCost() + 0.60;
    }
}
