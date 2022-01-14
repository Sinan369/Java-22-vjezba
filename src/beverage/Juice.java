package beverage;

public class Juice extends Beverage{

    //----konstruktor----
    public Juice() {
        super("Sok");
    }

    //----abstrakcija----
    @Override
    public void  beverageDrink() {
        System.out.println("hladan sa ledom i slamkicom i pola limuna na casi");
    }

    @Override
    public double beverageCost() {
        return 3.5;
    }
}
