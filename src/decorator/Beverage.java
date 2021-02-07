package decorator;

public abstract class Beverage {
    private String description = "default";
    public abstract int cost();

    public String getDescription() {
        return description;
    }
}
