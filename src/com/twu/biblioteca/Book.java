package com.twu.biblioteca;

public class Book {
    private String author;
    private String publicationYear;

    public Book (String author, String publicationYear) {
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }
}
