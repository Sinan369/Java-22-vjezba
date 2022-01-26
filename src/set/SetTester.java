package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {
    public static void main(String[] args) {

        System.out.println("---------- Hash Set ----------");
        System.out.println(" ");
        Set<String> namesHashSet = new HashSet<>();
        namesHashSet.add("Mrko");
        namesHashSet.add("Sinan");
        namesHashSet.add("Sinan");
        namesHashSet.add("adnan");
        namesHashSet.add("Mrko");

        for (String element : namesHashSet){
            System.out.println(element);
        }

        System.out.println("---------- Linked Hash Set ----------");
        System.out.println(" ");
        Set<String> namesLinkedHashSet = new LinkedHashSet<>();
        namesLinkedHashSet.add("Mrko");
        namesLinkedHashSet.add("Sinan");
        namesLinkedHashSet.add("Sinan");
        namesLinkedHashSet.add("adnan");
        namesLinkedHashSet.add("Mrko");

        for (String element : namesLinkedHashSet){
            System.out.println(element);
        }

        System.out.println("---------- Tree Set ----------");
        System.out.println(" ");
        Set<String> namesTreeSet = new TreeSet<>();
        namesTreeSet.add("Mrko");
        namesTreeSet.add("Sinan");
        namesTreeSet.add("Sinan");
        namesTreeSet.add("adnan");
        namesTreeSet.add("Mrko");

        for (String element : namesTreeSet){
            System.out.println(element);
        }
    }
}
