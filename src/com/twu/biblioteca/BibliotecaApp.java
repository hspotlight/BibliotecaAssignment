package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    Menu menu;
    BookManager bookManager;
    MovieManager movieManager;

    public BibliotecaApp() {
        menu = new Menu();
        bookManager = new BookManager();
        movieManager = new MovieManager();
    }

    public boolean checkoutBook(String bookName) {
        return bookManager.checkoutBook(bookName);
    }

    public boolean returnBook(String bookName) {
        return bookManager.returnBook(bookName);
    }

    public boolean isBookExistInList(String bookName) {
        return bookManager.isBookExistInList(bookName);
    }

    public boolean isBookAvailable(String bookName) {
        return bookManager.isBookAvailable(bookName);
    }

    public String selectMenu(String menuName) {
        return this.menu.selectMenu(menuName);
    }

    public void showMenu() {
        System.out.println();
        System.out.println("Please enter the menu name to select the menu:");
        for(String menuItem: this.menu.getMenu()) {
            System.out.println(menuItem);
        }
    }

    public void showListOfBooks() {
        System.out.println();
        System.out.println("a list of all library books:");
        for(Book book: this.bookManager.getListOfBooks()) {
            if (book.isAvailable()) {
                System.out.println(book.getDetail());
            }
        }
    }

    public void showListOfMovies() {
        System.out.println();
        System.out.println("a list of all available movies:");
        for(Movie movie: movieManager.getListOfMovies()) {
            System.out.println(movie.getDetail());
        }
    }

    public String getWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return welcomeMessage;
    }

    public String getReturnMessage(boolean isSuccessful) {
        if (isSuccessful) {
            return "Thank you for returning the book";
        }
        return "That is not a valid book to return";
    }

    public String getCheckoutMessage(boolean isSuccessful) {
        if (isSuccessful) {
            return "Thank you! Enjoy the book";
        }
        return "Sorry, that the book is not available";
    }

}
