package enums;

public enum Season {
    SPRING("Proljeće", " Budi se priroda!!!"),
    SUMMER("Ljeto", " Vrucine su velike dosezu i do +40 stepeni"),
    AUTUMN("Jesen", " Lišće počinje žutiti i opadari"),
    WINTER("Zima", " Pada snijeg i temperature idu i do -30 srepeni")
    ;

    private String name;
    private String description;

    Season(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

}
