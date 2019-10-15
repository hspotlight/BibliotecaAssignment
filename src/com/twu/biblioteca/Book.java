package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private String publicationYear;
    private boolean isAvailable;

    public Book (String name, String author, String publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }

    public String getName() {
        return name;
    }

    public void checkoutBook() {
        this.isAvailable = false;
    }

    public void returnBook() {
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getDetail() {
        return this.name + ", " + this.author + ", " + this.publicationYear;
    }
}
