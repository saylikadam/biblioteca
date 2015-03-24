package com.twu.biblioteca;

import java.util.List;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class BookList implements Option {

    private Library library;
    private Librarian librarian;

    public BookList(Library library, Librarian librarian) {

        this.library = library;
        this.librarian = librarian;
    }

    @Override
    public void execute() {
        printTitle();
        printBookDetails();
    }

    private void printBookDetails() {
        List<String> allBooks = library.getAvailableList();
        for (String b : allBooks) {
            System.out.println(b);
        }
    }

    private void printTitle() {
        System.out.println("BookName    AuthorName    PublishingYear");
        System.out.println("----------------------------------------");
    }
}
