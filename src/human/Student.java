package human;

import animal.Animal;

public class Student extends Person{
    private int indexId;

    public Student(String name, String surname, String id, Gender gender, int age, int indexId, Animal pets) {
        super(name, surname, id, gender, age, pets);
        this.indexId = indexId;
    }


    public int getIndexId() {
        System.out.println("Broj indexa je: " + indexId);
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

}
