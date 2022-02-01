package human;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {
    public List<Person> upitNaBazu(){
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Azra", "Sinanovic", "1210003454554", Gender.FEMALE, LocalDate.of(2003, 10, 12)));
        personList.add(new Person("Amna", "Skoropan", "130600545448", Gender.FEMALE, LocalDate.of(2005, 8, 13)));
        personList.add(new Person("Adnan", "Uzunovic", "120100058444", Gender.MALE, LocalDate.of(2000, 1, 12)));
        personList.add(new Person("Haris", "Celaosmanovic", "110209226664", Gender.MALE, LocalDate.of(1992, 2, 11)));
        personList.add(new Person("Amar", "Feratovic", "1503006554814", Gender.MALE, LocalDate.of(2006, 3, 15)));
        personList.add(new Person("Adi", "Lukač", "01010894456645", Gender.MALE, LocalDate.of(1989, 1, 1)));
        personList.add(new Person("Aman", "Salihovic", "010209000545", Gender.MALE, LocalDate.of(1990, 1, 2)));
        personList.add(new Person("Edina", "Hajdarevic", "0503002100300", Gender.FEMALE, LocalDate.of(2002, 3, 5)));
        personList.add(new Person("Aman", "Skoropan", "190700145448", Gender.MALE, LocalDate.of(2001, 7, 19)));
        return personList;
    }
}
