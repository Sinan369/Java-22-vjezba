package human;

import animal.Animal;

import java.time.LocalDate;

public class Employee extends Person{
    private double salaryAmount;


    public Employee(String name, String surname, String id, Gender gender, LocalDate birthday, Animal pets, double salaryAmount) {
        super(name, surname, id, gender, birthday, pets);
        this.salaryAmount = salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public double getSalaryAmount() {
        System.out.println("Plata je: " + salaryAmount);
        return salaryAmount;
    }

}
