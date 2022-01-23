import enums.Season;
import weather.Seasons;

import java.util.Random;

public class SeasonTester {
    public static void main(String[] args) {
        Random random = new Random();
        int randomSeason = random.nextInt(4);

        Seasons weather = new Seasons();

        switch (randomSeason){
            case 0:
                weather.setSeason(Season.SPRING);
                weather.getSeason();
                break;
            case 1:
                weather.setSeason(Season.SUMMER);
                weather.getSeason();
                break;
            case 2:
                weather.setSeason(Season.AUTUMN);
                weather.getSeason();
                break;
            case 3:
                weather.setSeason(Season.WINTER);
                weather.getSeason();
                break;
            default:
                break;
        }

    }
}
