
import human.Gender;
import human.Person;
import human.PersonReader;
import intercace.PersonTester;
import java.util.List;


public class PersonMainTester {
    public static void main(String[] args) {
    PersonReader personReader = new PersonReader();
    List<Person> personList = personReader.upitNaBazu();

    PersonTester personTester = (Person person)-> person.getGender().equals(Gender.MALE);

    for (Person person : personList){
        if (personTester.test(person)){
            System.out.println(person);
        }
    }






    }
}
