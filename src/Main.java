
import animal.Cat;
import animal.Dog;
import human.*;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Armin", "Husic", "121000587745454", Gender.MALE, 18, 557788, new Cat("Mikica", Gender.FEMALE, 11884, 1, "Turska Van Mačka"));
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
        System.out.println("---------------");
        Person osoba = new Person("Adnan", "Abazovic", "17120044844454", Gender.MALE, 21);
        osoba.getName();
        osoba.getSurname();
        osoba.getAge();
        osoba.getGender();
        osoba.getId();
    }
}
