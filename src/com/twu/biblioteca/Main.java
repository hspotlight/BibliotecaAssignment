package com.twu.biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        String inputMenuName, selectedMenu;

        BibliotecaApp application = new BibliotecaApp();
        String welcomeMessage = application.getWelcomeMessage();
        System.out.println(welcomeMessage);

        Menu menu = new Menu();
        menu.initialMenuItems();

        while(true) {
            application.showMenu(menu);
            inputMenuName = inputScanner.nextLine();

            selectedMenu = menu.selectMenu(inputMenuName);
            if (selectedMenu.equals("List of books")) {
                application.showListOfBooks();
            }
            else if (selectedMenu.equals("Checkout")) {
                System.out.println("Please enter the book name for checkout");
                String inputBookname = inputScanner.nextLine();
                boolean isCheckoutSuccessful = application.checkoutBook(inputBookname);
                String checkoutMessage = application.getCheckoutMessage(isCheckoutSuccessful);
                System.out.println(checkoutMessage);
            }
            else if (selectedMenu.equals("Return")) {
                System.out.println("Please enter the book name for return");
                String inputBookname = inputScanner.nextLine();
                boolean isReturnSuccessful = application.returnBook(inputBookname);
                String returnMessage = application.getReturnMessage(isReturnSuccessful);
                System.out.println(returnMessage);
            }
            else if (selectedMenu.equals("Please select a valid option!")) {
                System.err.println("Please select a valid option!");
            }
            else if (selectedMenu.equals("Quit")) {
                break;
            }
        }
    }
}
