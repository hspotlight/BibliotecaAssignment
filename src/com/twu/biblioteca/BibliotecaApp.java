package com.twu.biblioteca;

public class BibliotecaApp {

    Menu menu;
    Book[] books;

    public BibliotecaApp() {
        this.setupMenu();
        this.setupBooks();
    }

    public void setupMenu() {
        menu = new Menu();
        menu.initialMenuItems();
    }

    public void setupBooks() {
        books = new Book[2];
        books[0] = new Book("nameA", "authorA", "2019");
        books[1] = new Book("nameB", "authorB", "2019");
    }

    public String getWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return welcomeMessage;
    }

    public void showMenu(Menu menu) {
        System.out.println();
        System.out.println("Please enter the menu name to select the menu:");
        for(MenuItem menuItem: menu.getMenu()) {
            System.out.println(menuItem.getName());
        }
    }

    public void showListOfBooks() {
        System.out.println();
        System.out.println("a list of all library books:");
        for(Book book: books) {
            System.out.println(book.getDetail());
        }
    }

}
