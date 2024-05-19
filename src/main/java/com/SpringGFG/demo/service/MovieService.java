package com.SpringGFG.demo.service;

import com.SpringGFG.demo.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieService {

    private Map<Integer, Movie> movieMap = new HashMap<>();

    public boolean addMovie(Movie movie){
        int id = this.movieMap.size() + 1;
        movie.setId(id);
        this.movieMap.put(id, movie);

        return true;
    }

    public boolean deleteMovie(Integer id){
        if(movieMap.containsKey(id)){
            movieMap.remove(id);
        }
        return true;
    }

    public boolean updateMovie(Integer id, Movie movie){
        if(movieMap.containsKey(id)){
            movieMap.put(id,movie);
            return true;
        }
        return false;
    }

    public List<Movie> getAllMovies() {
        return this.movieMap.values().stream().toList();
    }

    public Movie getMovieByTitle(Integer id) {
        return this.movieMap.get(id);
    }
}
