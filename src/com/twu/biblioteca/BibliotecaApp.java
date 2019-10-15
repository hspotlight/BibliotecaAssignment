package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    Menu menu;
    ArrayList<Book> listOfBooks;

    public BibliotecaApp() {
        this.setupMenu();
        this.setupBooks();
    }

    private void setupMenu() {
        menu = new Menu();
    }

    private void setupBooks() {
        listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("nameA", "authorA", "2019"));
        listOfBooks.add(new Book("nameB", "authorB", "2019"));
    }

    public boolean checkoutBook(String bookName) {
        // if book is not available return false
        for(Book book: listOfBooks) {
            if (book.getName().equals(bookName)) {
                book.checkoutBook();
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String bookName) {
        if (!this.isBookExistInList(bookName) || this.isBookAvailable(bookName)) {
            return false;
        }

        Book book = getBookFromList(bookName);
        book.returnBook();
        return true;
    }

    public Book getBookFromList(String bookName) {
        for(Book book: listOfBooks) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    public boolean isBookExistInList(String bookName) {
        for(Book book: listOfBooks) {
            if (book.getName().equals(bookName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isBookAvailable(String bookName) {
        for(Book book: listOfBooks) {
            if (book.getName().equals(bookName)) {
                return book.isAvailable();
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
        for(Book book: listOfBooks) {
            if (book.isAvailable()) {
                System.out.println(book.getDetail());
            }
        }
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
