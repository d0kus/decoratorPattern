package Coffee;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Basic coffee";
    }

    @Override
    public double getCost() {
        return 2.00;
    }
}
