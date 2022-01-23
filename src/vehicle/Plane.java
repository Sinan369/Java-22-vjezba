package vehicle;

import intercace.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Avion leti uz pomoc motora!");
    }
}
