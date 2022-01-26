package animal;

import human.Gender;


public class Cat extends Animal{

    public Cat(){

    }

    private String catBreed;

    public Cat(String name, Gender gender, int id, int age, String catBreed) {
        super(name, gender, id, age);
    }


    public String getCatBreed() {
        return catBreed;
    }

    public void setCatBreed(String catBreed) {
        this.catBreed = catBreed;
    }
}
