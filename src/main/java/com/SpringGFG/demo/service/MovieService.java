package com.SpringGFG.demo.service;

import com.SpringGFG.demo.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieService {

    private Map<String, Movie> movieMap = new HashMap<>();

    public boolean addMovie(Movie movie){
        this.movieMap.put("firstMovie", movie);

        return true;
    }

    public boolean deleteMovie(String movieName){
        if(movieMap.containsKey(movieName)){
            movieMap.remove(movieName);
        }
        return true;
    }

    public boolean updateMovie(String title, Movie movie){
        if(movieMap.containsKey(title)){
            movieMap.put(title,movie);
            return true;
        }
        return false;
    }

    public List<Movie> getAllMovies() {
        return this.movieMap.values().stream().toList();
    }

    public Movie getMovieByTitle(String title) {
        return this.movieMap.get(title);
    }
}
