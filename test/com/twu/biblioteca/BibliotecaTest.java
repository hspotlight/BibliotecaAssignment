package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void welcomeMessageShouldShowWhenApplicationIsStarted() {
        String expectedWelcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        assertEquals(expectedWelcomeMessage, BibliotecaApp.getWelcomeMessage());
    }

    @Test
    public void showBookDetail() {
        Book book = new Book("nameA", "authorA", "2019");
        assertEquals("name: nameA, author: authorA, year: 2019", book.getDetail());
    }
}
