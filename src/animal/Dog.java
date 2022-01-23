package animal;

import human.Gender;

public class Dog extends Animal{
    private String dogBreed;


    public Dog(String name, Gender gender, int id, int age, String dogBreed) {
        super(name, gender, id, age);
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
