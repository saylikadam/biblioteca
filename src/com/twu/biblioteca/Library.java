package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankurks on 3/21/2015.
 * Library class to run a library
 */
public class Library {
    private List<Book> bookList;
    private String name;


    public Library(String name) {

        this.name = name;
        this.bookList = new ArrayList<Book>();
    }

    public List<Book> getAllBooks() {
        return bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public List<Book> actOn(String option) {
        return (option.equals("List Books")) ? getAllBooks() : null;
    }
}
