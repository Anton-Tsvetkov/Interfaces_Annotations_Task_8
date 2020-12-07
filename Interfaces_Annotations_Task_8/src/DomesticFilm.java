import java.util.Arrays;

abstract public class DomesticFilm implements IFilm{

    String title;
    String producer;
    String[] actors;

    String releaseDate;
    String country;
    String duration;

    int budget;
    int fees;

    boolean watching;
    boolean enableSubtitles;


    public DomesticFilm(String title, String producer, String[] actors,
                        String releaseDate, String country, String duration,
                        int budget, int fees) {
        this.title = title;
        this.producer = producer;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.country = country;
        this.duration = duration;
        this.budget = budget;
        this.fees = fees;
        this.watching = false;
        this.enableSubtitles = false;
    }

    public DomesticFilm(String title, String producer, String[] actors,
                        String releaseDate, String country, String duration, int budget) {
        this.title = title;
        this.producer = producer;
        this.actors = actors;
        this.releaseDate = releaseDate;
        this.country = country;
        this.duration = duration;
        this.budget = budget;
        this.watching = false;
        this.enableSubtitles = false;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String[] getActors() {
        return actors;
    }

    public void setActors(String[] actors) {
        this.actors = actors;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    @Override
    public void watch() {
        this.watching = true;
    }

    @Override
    public void stopWatching() {
        this.watching = false;
    }

    @Override
    public void enableSubtitles() {
        this.enableSubtitles = true;
    }

    @Override
    public void disableSubtitles() {
        this.enableSubtitles = false;
    }

    @Override
    public String toString() {
        return "DomesticFilm{" +
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
