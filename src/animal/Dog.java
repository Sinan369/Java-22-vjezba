package animal;

import human.Gender;

import java.time.LocalDate;

public class Dog extends Animal{
    private String dogBreed;


    public Dog(String name, Gender gender, int id, LocalDate birthday, String dogBreed) {
        super(name, gender, id, birthday);
    }

    public Dog() {
        super();

    }
    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }
}
