package intercace;
@FunctionalInterface
public interface Tester<E> {
    boolean test(E element);
}
