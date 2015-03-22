package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by ankurks on 3/21/2015.
 */
public class Library {
    private List<Book> bookList = new ArrayList<Book>();
    private String name;

    {
        bookList.add(new Book("Sherlock Holmes", "Sir Canon Doyle", "1990"));
        bookList.add(new Book("Wings Of Fire", "A P J Abdul Kalam", "1991"));
        bookList.add(new Book("Ramayana", "Maharshi Valmiki", "700"));
        bookList.add(new Book("Five Point Someone", "Chetan Bhagat", "1990"));
    }


    public Library(String name) {
//        this.bookList = new ArrayList<Book>();
        this.name = name;
    }

    public List<Book> getAllBooks() {
        return bookList;
    }
}
