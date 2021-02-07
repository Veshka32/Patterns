package decorator;

public class Espresso extends Beverage {

    private int cost = 1;
    private String description = "Espresso";

    public int cost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
