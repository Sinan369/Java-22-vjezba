package human;

public enum Gender {

    MALE("Muško rod","Jaki i pametni"),
    FEMALE("Žensko rod","Nježni i krhki"),
    OTHER("Nepoznati rod", "Ne želi da se oda")

    ;

    private String name, description;

    private Gender(String n, String d){
        this.name = n;
        this.description = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
