package animal;

import human.Gender;
import intercace.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name, Gender gender, int id, int age) {
        super(name, gender, id, age);
    }

    public Bird() {
    }

    @Override
    public void fly() {
        System.out.println(
                "Ja sam prica i mogu letjeti..."
        );
    }
}
