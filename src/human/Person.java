package human;

import animal.Animal;

public abstract class Person {
    private String name, surname, id;
    private Gender gender;
    private int age;
    private Animal pets;

    public Person(String name, String surname, String id, Gender gender, int age) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }

    public Person(String name, String surname, String id, Gender gender, int age, Animal pets) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.pets = pets;
    }


    public Animal getPets() {
        System.out.println("Ljubimac je: " + pets);
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
        System.out.println("Starost je: " + age);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
