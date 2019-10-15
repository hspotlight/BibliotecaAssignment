package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BookManagerTest {

    BookManager bookManager;

    @Before
    public void setupBookManager() {
        bookManager = new BookManager();
    }

    @Test
    public void checkoutBookShouldNotBeAvailable() {
        String bookName = "nameA";
        bookManager.checkoutBook(bookName);
        assertFalse(bookManager.isBookAvailable(bookName));
    }

    @Test
    public void returnBookShouldBeAvailable() {
        String bookName = "nameA";
        bookManager.checkoutBook(bookName);
        bookManager.returnBook(bookName);
        assertTrue(bookManager.isBookAvailable(bookName));
    }

    @Test
    public void invalidBookNameCouldNotBeCheckout() {
        String bookName = "invalidName";
        boolean isCheckoutSuccess = bookManager.checkoutBook(bookName);
        assertFalse(isCheckoutSuccess);
    }

    @Test
    public void returnedBookShouldBeInListAndNotBeAvailable() {
        String bookName = "nameA";
        bookManager.checkoutBook(bookName);
        boolean isValidToReturn = bookManager.isBookExistInList(bookName) && !bookManager.isBookAvailable(bookName);
        assertTrue(isValidToReturn);
    }
}
