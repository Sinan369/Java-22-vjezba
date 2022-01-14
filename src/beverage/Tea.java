package beverage;

public class Tea extends Beverage{

    //----konstruktor----
    public Tea() {
        super("Ćaj");
    }

    //----abstrakcija----
    @Override
    public void beverageDrink() {
        System.out.println("Pije se isto vruć sa uživanjem kod nekog i bez šećera!!!");
    }

    @Override
    public double beverageCost() {
        return 1.0;
    }
}
