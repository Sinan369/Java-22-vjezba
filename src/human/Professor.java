package human;

import animal.Animal;

public class Professor extends Employee {
    private String academicTitle;

    public Professor(String name, String surname, String id, Gender gender, int age, double salaryAmount, String academicTitle, Animal pets) {
        super(name, surname, id, gender, age, pets, salaryAmount);
        this.academicTitle = academicTitle;
    }

    public String getAcademicTitle() {
        System.out.println("Akademska titula je: " + academicTitle);
        return academicTitle;
    }

    public void setAcademicTitle(String academicTitle) {
        this.academicTitle = academicTitle;
    }

    @Override
    public void setSalaryAmount(double salaryAmount) {
        super.setSalaryAmount(salaryAmount * 2);
    }

}
