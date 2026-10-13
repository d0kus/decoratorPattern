import Coffee.Coffee;
import Coffee.SimpleCoffee;
import Coffee.Espresso;
import Decorator.MilkDecorator;
import Decorator.SugarDecorator;
import Decorator.SyrupDecorator;
import Decorator.WhipDecorator;


public class Main {
    public static void printOrder(Coffee coffee){
        System.out.println("Заказ:  " + coffee.getDescription());
        System.out.println("Итого:  $" + coffee.getCost());
    }

    public static void main(String[] args){
        System.out.println("Simple coffee");
        Coffee coffee1 = new SimpleCoffee();
        printOrder(coffee1);

        System.out.println("Simple coffee with milk and sugar");
        Coffee coffee2 = new SimpleCoffee();
        coffee2 = new MilkDecorator(coffee2);
        coffee2 = new SugarDecorator(coffee2);
        printOrder(coffee2);

        System.out.println("Espresso with buffs");
        Coffee dreamCoffee = new WhipDecorator(
                new SyrupDecorator(
                        new SugarDecorator(
                                new SugarDecorator(
                                        new Espresso())), "Cacao"));
        printOrder(dreamCoffee);

        System.out.println("Dynamic Creation");
        boolean wantsMilk = true;
        boolean wantsSyrup = false;
        boolean wantsWhip = true;

        Coffee customOrder = new Espresso();
        if (wantsMilk) {
            customOrder = new MilkDecorator(customOrder);
        }
        if (wantsSyrup) {
            customOrder = new SyrupDecorator(customOrder, "Vanilla");
        }
        if (wantsWhip) {
            customOrder = new WhipDecorator(customOrder);
        }
        printOrder(customOrder);

    }
}


