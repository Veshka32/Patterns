package decorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return beverage.cost() + 3;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
