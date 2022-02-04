package animal;

import human.Gender;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    private String name;
    private Gender gender;
    private int id;
    private LocalDate birthday;

    public Animal() {
    }

    public Animal(String name, Gender gender, int id, LocalDate birthday) {
        this.name = name;
        this.gender = gender;
        this.id = id;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        int age= period.getYears() * 12;
        return age;
    }

    @Override
    public String toString() {
        return "Ime ljubimca: " +  name + " " + getAge() + " mjeseci " + "ID: " + id;
    }
}
