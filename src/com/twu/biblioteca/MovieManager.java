package com.twu.biblioteca;

import java.util.ArrayList;

public class MovieManager {
    private ArrayList<Movie> listOfMovies;

    public MovieManager() {
        this.setupMovies();
    }

    private void setupMovies() {
        this.listOfMovies = new ArrayList<Movie>();
        this.listOfMovies.add(new Movie("movie1", "2019", "director1", 10));
        this.listOfMovies.add(new Movie("movie2", "2019", "director2", 8));
        this.listOfMovies.add(new Movie("movie3", "2019", "director3", 9));
    }

    public ArrayList<Movie> getListOfMovies() {
        return listOfMovies;
    }
}
