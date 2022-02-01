
import human.Gender;
import human.Person;
import human.PersonReader;
import intercace.PersonTester;
import intercace.Tester;
import movie.Movie;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonMainTester {
    public static void main(String[] args) {
        PersonReader personReader = new PersonReader();
        List<Person> personList = personReader.upitNaBazu();

        personList.stream().filter(person -> person.getGender().equals(Gender.MALE) && person.getAge() == 20).forEach(System.out::println);

    }

//    PersonTester personTester = (Person person)-> person.getGender().equals(Gender.FEMALE) && person.getAge()<=20;
//
//    for (Person person : personList){
//        if (personTester.test(person)){
//            System.out.println(person);
//            }
//        }
//    }
}
