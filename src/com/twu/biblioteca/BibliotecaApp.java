package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = getWelcomeMessage();
        System.out.println(welcomeMessage);

        Book[] books = new Book[2];
        books[0] = new Book("nameA", "authorA", "2019");
        books[1] = new Book("nameB", "authorB", "2019");

        System.out.println();
        System.out.println("a list of all library books:");
        for(Book book: books) {
            System.out.println(book.getDetail());
        }
    }

    public static String getWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return welcomeMessage;
    }
}
