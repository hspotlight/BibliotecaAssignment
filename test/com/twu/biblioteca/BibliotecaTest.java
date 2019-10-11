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
        menu.initialMenuItems();
        assertEquals("List of books", menu.getMenu()[0].getName());
    }

    @Test
    public void selectListOfBooksFromMenu() {
        Menu menu = new Menu();
        menu.initialMenuItems();
        String selectedMenu = menu.selectMenu("List of books");
        assertEquals("List of books", selectedMenu);
    }

    @Test
    public void selectInvalidOptionFromMenu() {
        Menu menu = new Menu();
        menu.initialMenuItems();
        String selectedMenu = menu.selectMenu("invalid option");
        assertEquals("Please select a valid option!", selectedMenu);
    }

    @Test
    public void selectQuitOptionFromMenu() {
        Menu menu = new Menu();
        menu.initialMenuItems();
        String selectedMenu = menu.selectMenu("Quit");
        assertEquals("Quit", selectedMenu);
    }

    @Test
    public void checkoutBookIsRemoveFromTheList() {
        BibliotecaApp application = new BibliotecaApp();
        application.checkoutBook("nameA");
        boolean isBookExist = application.isBookExist("nameA");
        assertFalse(isBookExist);
    }
}
