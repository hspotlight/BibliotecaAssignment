package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        String welcomeMessage = getWelcomeMessage();
        System.out.println(welcomeMessage);
    }

    public static String getWelcomeMessage() {
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return welcomeMessage;
    }
}
