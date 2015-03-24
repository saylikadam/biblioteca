package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by saylik on 3/24/2015.
 */
public class ReturnBook implements Option {
    private final Library library;
    private final Librarian librarian;

    public ReturnBook(Library library, Librarian librarian) {
        this.library = library;
        this.librarian = librarian;
    }

    @Override
    public void execute() {
        System.out.println("Enter the book name here : ");
        Scanner scan = new Scanner(System.in);
        Book returnBook = librarian.getBook(scan.nextLine());
        if (returnBook != null) {
            System.out.println("Thank you,Visit Again!\n");
        }
        else System.out.println("Enter name correctly");
    }
}
