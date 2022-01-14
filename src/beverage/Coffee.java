package beverage;

public class Coffee extends Beverage{

    //----konstruktor----
    public Coffee() {
        super("Kahva");
    }

    //----abstrakcija----
    @Override
    public void  beverageDrink() {
        System.out.println("Kafu pijemo sa ćejfonm");
    }

    @Override
    public double beverageCost() {
        return 1.5;
    }
}
