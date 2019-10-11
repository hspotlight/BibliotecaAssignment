package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String inputMenuName, selectedMenu;

        String welcomeMessage = getWelcomeMessage();
        System.out.println(welcomeMessage);

        Menu menu = new Menu();
        menu.initialMenuItems();

        System.out.println();
        System.out.println("Menu:");
        for(MenuItem menuItem: menu.getMenu()) {
            System.out.println(menuItem.getName());
        }

        do {
            inputMenuName = inputScanner.nextLine();
            selectedMenu = menu.selectMenu(inputMenuName);
            if (selectedMenu.equals("Please select a valid option")) {
                System.out.println("Please select a valid option");
            }
        }
        while(selectedMenu.equals("Please select a valid option"));

        if (selectedMenu.equals("List of books")) {
            BibliotecaApp.showListOfBooks();
        }
    }

    public static String getWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return welcomeMessage;
    }

    public static void showListOfBooks() {
        Book[] books = new Book[2];
        books[0] = new Book("nameA", "authorA", "2019");
        books[1] = new Book("nameB", "authorB", "2019");

        System.out.println();
        System.out.println("a list of all library books:");
        for(Book book: books) {
            System.out.println(book.getDetail());
        }
    }

}
