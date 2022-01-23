package human;

import animal.Animal;

public class Employee extends Person{
    private double salaryAmount;


    public Employee(String name, String surname, String id, Gender gender, int age, Animal pets, double salaryAmount) {
        super(name, surname, id, gender, age, pets);
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
