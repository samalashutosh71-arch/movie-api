package com.ashu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.Service.MovieService;
import com.ashu.model.Movie;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Add new movie
    @PostMapping
    public Movie addMovie(@Valid @RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }

    // Get movie by ID
    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }
}
