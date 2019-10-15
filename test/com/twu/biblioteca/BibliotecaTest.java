package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaTest {

    @Test
    public void welcomeMessageShouldShowWhenApplicationIsStarted() {
        String expectedWelcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        BibliotecaApp application = new BibliotecaApp();
        assertEquals(expectedWelcomeMessage, application.getWelcomeMessage());
    }

    @Test
    public void showBookDetail() {
        Book book = new Book("nameA", "authorA", "2019");
        assertEquals("nameA, authorA, 2019", book.getDetail());
    }

    @Test
    public void showMenuItemName() {
        Menu menu = new Menu();
        assertEquals("List of books", menu.getMenu().get(0));
    }

    @Test
    public void selectListOfBooksFromMenu() {
        Menu menu = new Menu();
        String selectedMenu = menu.selectMenu("List of books");
        assertEquals("List of books", selectedMenu);
    }

    @Test
    public void selectInvalidOptionFromMenu() {
        Menu menu = new Menu();
        String selectedMenu = menu.selectMenu("invalid option");
        assertEquals("Please select a valid option!", selectedMenu);
    }

    @Test
    public void selectQuitOptionFromMenu() {
        Menu menu = new Menu();
        String selectedMenu = menu.selectMenu("Quit");
        assertEquals("Quit", selectedMenu);
    }

    @Test
    public void checkoutBookIsRemoveFromTheList() {
        BibliotecaApp application = new BibliotecaApp();
        application.checkoutBook("nameA");
        boolean isBookExist = application.isAvailableBookExist("nameA");
        assertFalse(isBookExist);
    }

    @Test
    public void showSuccessfulCheckoutMessage() {
        BibliotecaApp application = new BibliotecaApp();
        boolean isCheckoutSuccessful = application.checkoutBook("nameA");
        assertEquals("Thank you! Enjoy the book", application.getCheckoutMessage(isCheckoutSuccessful));
    }

    @Test
    public void showUnsuccessfulCheckoutMessage() {
        BibliotecaApp application = new BibliotecaApp();
        boolean isCheckoutSuccessful = application.checkoutBook("nameC");
        assertEquals("Sorry, that the book is not available", application.getCheckoutMessage(isCheckoutSuccessful));
    }

    @Test
    public void returnBookShouldBeInTheListOfBooks() {
        BibliotecaApp application = new BibliotecaApp();
        boolean isBookExist = application.isBookExist("nameA");
        assertTrue(isBookExist);
    }

    @Test
    public void returnBookShouldNotBeInTheAvailableLists() {
        BibliotecaApp application = new BibliotecaApp();
        application.checkoutBook("nameA");
        boolean isBookExist = application.isAvailableBookExist("nameA");
        assertFalse(isBookExist);
    }

    @Test
    public void showUnsuccessfulReturnMessage() {
        BibliotecaApp application = new BibliotecaApp();
        boolean isReturnSuccessful = application.returnBook("nameA");
        assertEquals("That is not a valid book to return", application.getReturnMessage(isReturnSuccessful));
    }

    @Test
    public void showSuccessfulReturnMessage() {
        BibliotecaApp application = new BibliotecaApp();
        application.checkoutBook("nameA");
        boolean isReturnSuccessful = application.returnBook("nameA");
        assertEquals("Thank you for returning the book",  application.getReturnMessage(isReturnSuccessful));
    }
}
