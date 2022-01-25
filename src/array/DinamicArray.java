package array;

import java.util.ArrayList;

public class DinamicArray {
    public static void main(String[] args) {

        ArrayList<Integer> brojevi = new ArrayList<>();
        brojevi.add(5);
        brojevi.add(25);
        brojevi.add(580);
        brojevi.add(3);
        brojevi.add(13);
        brojevi.add(23);

        for (int broj: brojevi){
            System.out.println(broj);
        }

        System.out.println("......Neki tekst koji će razlokovati...........");

        ArrayList<String> imenaCsgoGamera = new ArrayList<>();
        imenaCsgoGamera.add("Simple");
        imenaCsgoGamera.add("Boomich");
        imenaCsgoGamera.add("Shox");
        imenaCsgoGamera.add("NAC");
        imenaCsgoGamera.add("Fallen");

        for (String imena : imenaCsgoGamera){
            System.out.println(imena);
        }
    }
}
