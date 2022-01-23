package enums;

public enum Season {
    SPRING("Proljeće"),
    SUMMER("Ljeto"),
    AUTUMN("Jesen"),
    WINTER("Zima")
    ;

    private String name;

    private Season(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
