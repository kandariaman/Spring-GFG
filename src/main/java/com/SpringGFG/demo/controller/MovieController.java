package com.SpringGFG.demo.controller;

import com.SpringGFG.demo.domain.Movie;
import com.SpringGFG.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/movie")
    public void addMovie(@RequestBody Movie movie){
        movieService.addMovie(movie);
    }

    @GetMapping("/movie")
    public List<Movie> getMovies(){
        return movieService.getAllMovies();
    }

    @GetMapping("/movie/{id}")
    public void getMovieByTitle(@PathVariable("id") Integer id) {
        movieService.getMovieByTitle(id);
    }

    @DeleteMapping("/movie/{id}")
    public void deleteMovie(@PathVariable("id") Integer id){
        movieService.deleteMovie(id);
    }
}
