package generic;

public class GenericTypes<E> {
    private E fields;

    public GenericTypes() {
    }

    public GenericTypes(E fields) {
        this.fields = fields;
    }



    public E use() {
        System.out.println(fields);
        return fields;
    }

    public void add(E fields) {
        this.fields = fields;
    }
}
