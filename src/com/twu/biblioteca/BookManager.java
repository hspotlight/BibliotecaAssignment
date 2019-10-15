package com.twu.biblioteca;

import java.util.ArrayList;

public class BookManager {
    ArrayList<Book> listOfBooks;

    public BookManager() {
        this.setupBooks();
    }

    private void setupBooks() {
        listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("nameA", "authorA", "2019"));
        listOfBooks.add(new Book("nameB", "authorB", "2019"));
    }

    public boolean checkoutBook(String bookName) {
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

    private Book getBookFromList(String bookName) {
        for(Book book: listOfBooks) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }
}
