import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieManager {
    private List<Movie> movies;

    public MovieManager(){
        movies = new ArrayList<>();
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> searchByTitle(String title) {
        return movies.stream()
                .filter(movie -> movie.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());


    public List<Movie> searchByReleaseYear(int year) {
        return movies.stream()
                .filter(movie -> movie.getReleaseYear() == year)
                .collect(Collectors.toList());
        }

        //Add more methods to search by genre and actor

    public List<Movie> getAllMovies() {
        return movies;
        }
    }
}
