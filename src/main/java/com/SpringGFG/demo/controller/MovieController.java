package com.SpringGFG.demo.controller;

import com.SpringGFG.demo.domain.Movie;
import com.SpringGFG.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public void getMovies(){
        movieService.getAllMovies();
    }

    @GetMapping("/movie/{title}")
    public void getAllMovies(@PathVariable("title") String title) {
        movieService.getMovieByTitle(title);
    }

    @DeleteMapping("/movie/{title}")
    public void deleteMovie(@PathVariable("title") String title){
        movieService.deleteMovie(title);
    }
}
