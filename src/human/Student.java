package human;

import animal.Animal;

import java.time.LocalDate;

public class Student extends Person{
    private int indexId;

    public Student(String name, String surname, String id, Gender gender, LocalDate birthday, int indexId, Animal pets) {
        super(name, surname, id, gender, birthday, pets);
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
