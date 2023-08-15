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
}
