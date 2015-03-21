package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ankurks on 3/21/2015.
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
}
