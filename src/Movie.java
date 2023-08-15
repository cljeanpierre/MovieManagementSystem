import java.util.ArrayList;
import java.util.List;

public class Movie {
    private int id;
    private String title;
    private int releaseYear;
    private String genre;
    private List<String> actors;

    //Constructor
    public Movie(int id, String title, int releaseYear, String genre) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.actors = new ArrayList<>();
    }

    //Methods to add and retrieve actors
    public void addActor(String actor) {
        actors.add(actor);
    }

    public List<String> getActors() {
        return actors;
    }

    //Getter Methods for other attributes
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Release Year: " + releaseYear + ", Genre: " + genre + ", Actors: " + actors;
    }
}
