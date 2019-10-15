package com.twu.biblioteca;

public class Movie {
    private String name;
    private String year;
    private String director;
    private int movieRating;

    public Movie(String name, String year, String director, int movieRating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

    public String getDetail() {
        return this.name + ", " + this.year + ", " + this.director + ", " + this.movieRating;
    }
}
