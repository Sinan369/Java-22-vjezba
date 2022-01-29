package animal;

import human.Gender;

import java.time.LocalDate;


public class Cat extends Animal{

    public Cat(){

    }

    private String catBreed;

    public Cat(String name, Gender gender, int id, LocalDate birthday, String catBreed) {
        super(name, gender, id, birthday);
    }


    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }
}
