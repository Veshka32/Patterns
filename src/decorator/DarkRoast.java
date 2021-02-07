package decorator;

public class DarkRoast extends Beverage {
    private int cost = 1;
    private String description = "Dark Roast";

    public int cost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
