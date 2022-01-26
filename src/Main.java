import animal.Cat;
import animal.Dog;
import human.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Armin", "Husic", "121000587745454", Gender.MALE, LocalDate.of(2008, 4, 1), 557788, new Cat("Mikica", Gender.FEMALE, 11884, 1, "Turska Van Mačka"));
            student.getName();
            student.getSurname();
            student.getAge();
            student.getGender();
            student.getId();
            student.getIndexId();
            student.getPets();
        System.out.println("---------------");
        Professor profa = new Professor("Amar", "Feratovic", "14050023789894", Gender.MALE, LocalDate.of(2006, 1, 1), 1000, "prof.dr", new Dog("Roža", Gender.MALE, 55778,3, "Huskey"));
            profa.getName();
            profa.getSurname();
            profa.getAge();
            profa.getGender();
            profa.getId();
            profa.getSalaryAmount();
            profa.getAcademicTitle();
            profa.getPets();
        System.out.println("---------------");
        Person osoba = new Person("Adnan", "Abazovic", "17120044844454", Gender.MALE, LocalDate.of(2001, 1, 5));
            osoba.getName();
            osoba.getSurname();
            osoba.getAge();
            osoba.getGender();
            osoba.getId();
    }
}
