import beverage.*;
import movie.Movie;

public class Main {
    public static void main(String[] args) {

        Beverage coffee = new Coffee();
        BeverageConsumer beverageConsumer = new BeverageConsumer(coffee);
        beverageConsumer.consume();

        TurkishTea turkishTea = new TurkishTea();
        BeverageConsumer beverageConsumer1 = new BeverageConsumer(turkishTea);
        beverageConsumer1.consume();

        Beverage tea = new Tea();
        BeverageConsumer beverageConsumer2 = new BeverageConsumer(tea);
        beverageConsumer2.consume();

        Juice juice = new Juice();
        BeverageConsumer beverageConsumer3 = new BeverageConsumer(juice);
        beverageConsumer3.consume();
    }
}
