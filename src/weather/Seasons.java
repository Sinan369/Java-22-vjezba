package weather;

import enums.Season;

public class Seasons {
    private Season season;



    public Season getSeason() {
        System.out.println("Godišnje doba je: " + season.getName() + season.getDescription());

        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
