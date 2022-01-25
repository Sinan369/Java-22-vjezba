import generic.GenericTypes;

public class GenericTypesTester {
    public static void main(String[] args) {
        GenericTypes<String> ime = new GenericTypes<>();
        ime.add("Miki");
        ime.use();

        GenericTypes<Integer> broj = new GenericTypes<>();
        broj.add(8);
        broj.use();

        GenericTypes<Character> slovo = new GenericTypes<>();
        slovo.add('a');
        slovo.use();

        GenericTypes<Double> decimalac = new GenericTypes<>(1.5);
        decimalac.use();


    }
}
