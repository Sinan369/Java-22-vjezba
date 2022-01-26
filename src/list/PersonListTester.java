package list;

import human.Gender;
import human.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonListTester {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person p = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, LocalDate.of(2001, 10, 16));
        persons.add(p);
        Person p1 = new Person("Sinan", "Sinanovic", "1558451555", Gender.MALE, LocalDate.of(2005, 2, 12));
        persons.add(p1);
        persons.add(p1);
        Person p2 = new Person("Amar", "Feratovic", "4854451212", Gender.MALE, LocalDate.of(1994, 4, 10));
        persons.add(p2);
        Person p3 = new Person("Adna", "Ibrahimovic", "4788545422", Gender.FEMALE, LocalDate.of(1965, 8, 12));
        persons.add(p3);
        Person p4 = new Person("Anoniman", "Anoniman", "1558451555", Gender.OTHER, LocalDate.of(1943, 12, 8));
        persons.add(p4);

        for (Person person:persons){
            System.out.println(person);
        }
    }
}
