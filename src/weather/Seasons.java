package weather;

import enums.Season;

public class Seasons {
    private Season name;


    public Season getName() {
        System.out.println("Godišnje doba je: " + name.getName());
        return name;
    }

    public void setName(Season name) {
        this.name = name;
    }
}
