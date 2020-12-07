import java.util.Arrays;

public class Comedy extends DomesticFilm{
    public Comedy(String title, String producer, String[] actors, String releaseDate, String country, String duration, int budget, int fees) {
        super(title, producer, actors, releaseDate, country, duration, budget, fees);
    }

    public Comedy(String title, String producer, String[] actors, String releaseDate, String country, String duration, int budget) {
        super(title, producer, actors, releaseDate, country, duration, budget);
    }

    @Override
    public String toString() {
        return "Comedy{" +
                "title='" + title + '\'' +
                ", producer='" + producer + '\'' +
                ", actors=" + Arrays.toString(actors) +
                ", releaseDate='" + releaseDate + '\'' +
                ", country='" + country + '\'' +
                ", duration='" + duration + '\'' +
                ", budget=" + budget +
                ", fees=" + fees +
                '}';
    }
}
