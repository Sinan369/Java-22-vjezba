
import animal.Cat;
import animal.Dog;
import enums.Season;
import human.*;
import weather.Seasons;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Armin", "Husic", "121000587745454", Gender.MALE, 18, 557788, new Cat("Mikica", Gender.FEMALE, 11884, 1, "Turska Van Mačka") {
        });
        student.getName();
        student.getSurname();
        student.getAge();
        student.getGender();
        student.getId();
        student.getIndexId();
        student.getPets();
        System.out.println("---------------");
        Professor profa = new Professor("Amar", "Feratovic", "14050023789894", Gender.MALE, 20, 1000, "prof.dr", new Dog("Roža", Gender.MALE, 55778,3, "Huskey"));
        profa.getName();
        profa.getSurname();
        profa.getAge();
        profa.getGender();
        profa.getId();
        profa.getSalaryAmount();
        profa.getAcademicTitle();
        profa.getPets();
        System.out.println("--------");
        Seasons godisnjaDoba = new Seasons();
        godisnjaDoba.setName(Season.SUMMER);
        godisnjaDoba.getName();




    }
}
