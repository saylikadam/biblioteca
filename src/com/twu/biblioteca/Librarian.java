package com.twu.biblioteca;

/**
 * Created by kaustavc on 3/23/2015.
 */
public class Librarian {
    private String name;
    private Library library;

    public Librarian(String name, Library thoughtWorks) {
        this.name = name;
        library = thoughtWorks;
    }

    public Book getBook(String bookName) {
        return library.getParticularBook(bookName);
    }
}
