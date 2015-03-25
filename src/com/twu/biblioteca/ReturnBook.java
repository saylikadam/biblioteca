package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by saylik on 3/24/2015.
 */
public class ReturnBook implements Option {
    private final Library library;

    public ReturnBook(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        System.out.println("Enter the book name here : ");
        Scanner scan = new Scanner(System.in);

        if (library.returnBook(scan.nextLine())) {
            System.out.println("Thank you for returning the book!\n");
        }
        else System.out.println("Enter name correctly\n");
    }
}
