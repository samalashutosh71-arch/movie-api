package com.ashu.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ashu.model.Movie;
@Service
public class MovieService implements IMovieService {

    private final List<Movie> movies = new ArrayList<>();
    private Long idCounter = 1L;

    public Movie addMovie(Movie movie) {
        movie.setId(idCounter++);
        movies.add(movie);
        return movie;
    }

    public Movie getMovieById(Long id) {
        return movies.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null);
    }


}
