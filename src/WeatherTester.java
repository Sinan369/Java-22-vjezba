import enums.Season;
import weather.Seasons;

public class WeatherTester {
    public static void main(String[] args) {
        Seasons proljece = new Seasons();
        proljece.setSeason(Season.SPRING);
        proljece.getSeason();

        Seasons ljeto = new Seasons();
        ljeto.setSeason(Season.SUMMER);
        ljeto.getSeason();

        Seasons jesen = new Seasons();
        jesen.setSeason(Season.AUTUMN);
        jesen.getSeason();

        Seasons zima = new Seasons();
        zima.setSeason(Season.WINTER);
        zima.getSeason();
    }
}
