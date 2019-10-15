package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    Menu menu;
    ArrayList<Book> availableBooks;
    ArrayList<Book> allBooks;

    public BibliotecaApp() {
        this.setupMenu();
        this.setupBooks();
    }

    public void setupMenu() {
        menu = new Menu();
    }

    public void setupBooks() {
        allBooks = new ArrayList<Book>();
        allBooks.add(new Book("nameA", "authorA", "2019"));
        allBooks.add(new Book("nameB", "authorB", "2019"));

        availableBooks = new ArrayList<Book>();
        availableBooks.add(new Book("nameA", "authorA", "2019"));
        availableBooks.add(new Book("nameB", "authorB", "2019"));
    }

    public boolean checkoutBook(String bookName) {
        for(Book book: availableBooks) {
            if (book.getName().equals(bookName)) {
                availableBooks.remove(book);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String bookName) {
        if (!this.isBookExist(bookName) || this.isAvailableBookExist(bookName)) {
            return false;
        }
        Book book = getBookFromAllBooks(bookName);
        this.availableBooks.add(book);
        return true;
    }

    public String getReturnMessage(boolean isSuccessful) {
        if (isSuccessful) {
            return "Thank you for returning the book";
        } else {
            return "That is not a valid book to return";
        }
    }

    public String getCheckoutMessage(boolean isSuccessful) {
        if (isSuccessful) {
            return "Thank you! Enjoy the book";
        }
        else {
            return "Sorry, that the book is not available";
        }
    }

    public Book getBookFromAllBooks(String bookName) {
        for(Book book: allBooks) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    public boolean isBookExist(String bookName) {
        for(Book book: allBooks) {
            if (book.getName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isAvailableBookExist(String bookName) {
        for(Book book: availableBooks) {
            if (book.getName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public String getWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return welcomeMessage;
    }

    public void showMenu(Menu menu) {
        System.out.println();
        System.out.println("Please enter the menu name to select the menu:");
        for(String menuItem: menu.getMenu()) {
            System.out.println(menuItem);
        }
    }

    public void showListOfBooks() {
        System.out.println();
        System.out.println("a list of all library books:");
        for(Book book: availableBooks) {
            System.out.println(book.getDetail());
        }
    }

}
