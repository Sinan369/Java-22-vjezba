package intercace;

import human.Person;

@FunctionalInterface
public interface PersonTester {
    boolean test(Person person);
}
