package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private String publicationYear;

    public Book (String name, String author, String publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }

    public String getDetail() {
        return getName() + ", " + getAuthor() + ", " + getPublicationYear();
    }

    public Book clone() {
        Book cloneBook = new Book(this.getName(), this.getAuthor(), this.getPublicationYear());
        return cloneBook;
    }
}
