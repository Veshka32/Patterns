package decorator;

public class MakeCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        Beverage withMilk = new Mocha(beverage);
        Beverage withWhip = new Whip(withMilk);

        System.out.println(beverage.cost() + ", " + beverage.getDescription());
        System.out.println(withMilk.cost() + ", " + withMilk.getDescription());
        System.out.println(withWhip.cost() + ", " + withWhip.getDescription());
    }
}
