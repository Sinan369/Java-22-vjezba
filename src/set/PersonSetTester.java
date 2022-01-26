package set;

import human.Gender;
import human.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class PersonSetTester {
    public static void main(String[] args) {
        Collection<Person> persons = new HashSet<>();
        Person p = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, 23);
        persons.add(p);
        Person p1 = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, 23);
        persons.add(p1);
        persons.add(p1);
        Person p2 = new Person("Amar", "Feratovic", "4854451212", Gender.MALE, 22);
        persons.add(p2);
        Person p3 = new Person("Adna", "Ibrahimovic", "4788545422", Gender.FEMALE, 43);
        persons.add(p3);
        Person p4 = new Person("Anoniman", "Anoniman", "1558451555", Gender.OTHER, 44);
        persons.add(p4);

        for (Person person:persons){
            System.out.println(person);
        }
    }
}
