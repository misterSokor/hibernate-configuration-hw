package mate.academy;

import mate.academy.lib.Injector;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

public class Main {
    public static void main(String[] args) {
        Injector injector = Injector.getInstance("mate.academy");
        MovieService movieService = (MovieService) injector.getInstance(MovieService.class);

        Movie movie = new Movie("The Godfather", "Best movie ever");

        System.out.println(movieService.add(movie));

        System.out.println("Movie from DB: " + movieService.get(1L));
    }
}
