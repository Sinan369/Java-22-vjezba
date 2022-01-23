import animal.Animal;
import animal.Bird;
import animal.Cat;
import animal.Dog;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Cat();

        if (animal instanceof Dog){
            System.out.println("Pas");
        } else if(animal instanceof Cat){
            System.out.println("Mačka");
        } else if(animal instanceof Bird){
            System.out.println("Ptica");
        } else {
            System.out.println("Neka živuljka!!!");
        }
    }
}
