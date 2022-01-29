package animal;

import human.Gender;
import intercace.Flyable;

import java.time.LocalDate;

public class Bird extends Animal implements Flyable {
    public Bird(String name, Gender gender, int id, LocalDate birthday) {
        super(name, gender, id, birthday);
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
