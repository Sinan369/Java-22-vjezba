package beverage;

public class BeverageConsumer {
    private Beverage beverage;

    public BeverageConsumer(Beverage beverage){
        this.beverage = beverage;
    }

    public void consume(){
        System.out.println("Konzumiram " + beverage.getBeverageName() + " i to me košta " + beverage.beverageCost());
    }

}
