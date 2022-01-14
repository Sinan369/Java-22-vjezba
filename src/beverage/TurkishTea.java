package beverage;

public class TurkishTea extends Beverage{

    //----konstruktor----
    public TurkishTea() {
        super("Siyah Cay");
    }

    //----abstraktne funkcije----
    @Override
    public void beverageDrink() {
        System.out.println("Pije se sa užitkom kod nekog i bez šećera aludiram na sebe!!!");
    }

    @Override
    public double beverageCost() {
        return 2.5;
    }
}
