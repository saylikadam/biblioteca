package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class BookCheckOut implements Option {
    private final String name;
    private Library library;

    public BookCheckOut(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    @Override
    public void execute() {
        checkoutBook();
    }

    @Override
    public String getOptionName() {
        return name;
    }

    private void checkoutBook() {
        System.out.println("Enter the book name here : ");
        Scanner scan = new Scanner(System.in);

        if (library.getBook(scan.nextLine()) != null) {
            System.out.println("Thank you, Enjoy the book\n");
        }

        else System.out.println("That book is not available\n");
    }
}
