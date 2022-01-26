package human;

import animal.Animal;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name, surname, id;
    private Gender gender;
    private LocalDate birthday;
    private Animal pets;

    public Person(String name, String surname, String id, Gender gender, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gender = gender;
        this.birthday = birthday;
    }

    public Person(String name, String surname, String id, Gender gender, LocalDate birthday, Animal pets) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gender = gender;
        this.birthday = birthday;
        this.pets = pets;
    }


    public Animal getPets() {
        System.out.println(pets);
        return pets;
    }

    public void setPets(Animal pets) {
        this.pets = pets;
    }

    public Person(){
        super();
    }

    public String getName() {
        System.out.println("Ime je: " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        System.out.println("Prezime je: " + surname);
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        System.out.println("Maticni broj je: " + id);
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Gender getGender() {
        System.out.println("Spol je: " + gender);
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        int age = birthday.until(now).getYears();
        System.out.println("Starost je: " + age);
        return age;
    }

    public int compareAge() {
        LocalDate now = LocalDate.now();
        int age = birthday.until(now).getYears();
        return age;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Ime i prezime: " + name + " " + surname + " Matični broj: " + id + " Spol: " + gender.getName() + " Starost: " + getAge() + ". godine.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthday == person.birthday && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(id, person.id) && gender == person.gender && Objects.equals(pets, person.pets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, gender, birthday, pets);
    }

    @Override
    public int compareTo(Person o) {
        LocalDate now = LocalDate.now();
        int age = birthday.until(now).getYears();

        if (age < o.compareAge()) {
            return -1;
        }
        if (age > o.compareAge()){
            return 1;
        }
        return 0;
    }
}
