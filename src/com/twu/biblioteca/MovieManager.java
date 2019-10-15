package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieManager {
    ArrayList<Movie> movies;

    public MovieManager() {
        this.setupMovies();
    }

    private void setupMovies() {
        this.movies = new ArrayList<Movie>();
        this.movies.add(new Movie("movie1", "2019", "Hong", 10));
        this.movies.add(new Movie("movie2", "2019", "Hong", 8));
        this.movies.add(new Movie("movie3", "2019", "Hong", 9));
    }
}
