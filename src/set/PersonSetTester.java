package set;

import human.Gender;
import human.Person;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class PersonSetTester {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("---------- Hash Set ----------");
        Collection<Person> personsHashSet = new HashSet<>();
        Person p = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, 23);
        personsHashSet.add(p);
        Person p1 = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, 23);
        personsHashSet.add(p1);
        personsHashSet.add(p1);
        Person p2 = new Person("Amar", "Feratovic", "4854451212", Gender.MALE, 22);
        personsHashSet.add(p2);
        Person p3 = new Person("Adna", "Ibrahimovic", "4788545422", Gender.FEMALE, 43);
        personsHashSet.add(p3);
        Person p4 = new Person("Anoniman", "Anoniman", "1558451555", Gender.OTHER, 44);
        personsHashSet.add(p4);

        for (Person person:personsHashSet){
            System.out.println(person);
        }

        System.out.println(" ");
        System.out.println("---------- Linked Hash Set ----------");

        Collection<Person> personsLinkedHashSet = new LinkedHashSet<>();
        Person p5 = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, 23);
        personsLinkedHashSet.add(p5);
        Person p6 = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, 23);
        personsLinkedHashSet.add(p6);
        personsLinkedHashSet.add(p6);
        Person p7 = new Person("Amar", "Feratovic", "4854451212", Gender.MALE, 22);
        personsLinkedHashSet.add(p7);
        Person p8 = new Person("Adna", "Ibrahimovic", "4788545422", Gender.FEMALE, 43);
        personsLinkedHashSet.add(p8);
        Person p9 = new Person("Anoniman", "Anoniman", "1558451555", Gender.OTHER, 44);
        personsLinkedHashSet.add(p9);

        for (Person person:personsLinkedHashSet){
            System.out.println(person);
        }

        System.out.println(" ");
        System.out.println("---------- Tree Set ----------");
        // u ovom slučaju porede se godine!!! Sve izmjene se nalaze na lokaciji human.Person u liniji koda od 111 do 120!
        Collection<Person> personsTreeSet = new TreeSet<>();
        Person p10 = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, 23);
        personsTreeSet.add(p10);
        Person p11 = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, 23);
        personsTreeSet.add(p11);
        personsTreeSet.add(p11);
        Person p12 = new Person("Amar", "Feratovic", "4854451212", Gender.MALE, 22);
        personsTreeSet.add(p12);
        Person p13 = new Person("Adna", "Ibrahimovic", "4788545422", Gender.FEMALE, 43);
        personsTreeSet.add(p13);
        Person p14 = new Person("Anoniman", "Anoniman", "1558451555", Gender.OTHER, 44);
        personsTreeSet.add(p14);

        for (Person person:personsTreeSet){
            System.out.println(person);
        }
    }
}
