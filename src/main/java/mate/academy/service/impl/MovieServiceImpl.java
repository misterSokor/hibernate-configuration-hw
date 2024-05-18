package mate.academy.service.impl;

import mate.academy.dao.MovieDao;
import mate.academy.lib.Inject;
import mate.academy.lib.Service;
import mate.academy.model.Movie;
import mate.academy.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {
    @Inject
    private MovieDao movieDao;

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        if (movieDao == null) {
            throw new IllegalStateException("MovieDao is not injected");
        }
        return movieDao.get(id).orElseThrow(() -> new RuntimeException(
                "Movie with id " + id + " not found"));
    }
}
