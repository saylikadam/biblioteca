package com.twu.biblioteca;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class Quit implements Option {
    private Library library;
    private Librarian librarian;

    public Quit(Library library, Librarian librarian) {

        this.library = library;
        this.librarian = librarian;
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
