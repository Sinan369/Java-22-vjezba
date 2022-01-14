package beverage;

public abstract class Beverage {

    private String beverageName;

    public abstract void beverageDrink();
    public abstract double beverageCost();

    public Beverage(String beverageName) {
        this.beverageName = beverageName;
    }

    public String getBeverageName() {
        return beverageName;
    }
}
