package com.twu.biblioteca;

import java.util.List;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class BookList implements Option {

    private final String name;
    private Library library;

    public BookList(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    @Override
    public void execute() {
        printTitle();
        printBookDetails();
    }

    @Override
    public String getOptionName() {
        return name;
    }

    private void printBookDetails() {
        List<String> allBooks = library.getAvailableList();
        for (String bookDetail : allBooks) {
            System.out.println(bookDetail);
        }

        System.out.println(System.lineSeparator());
    }

    private void printTitle() {
        System.out.println("BookName    AuthorName    PublishingYear");
        System.out.println("----------------------------------------");
    }
}
