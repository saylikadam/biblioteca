package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class BookCheckOut implements Option {
    private Library library;
    private Librarian librarian;

    public BookCheckOut(Library library, Librarian librarian) {
        this.library = library;
        this.librarian = librarian;
    }

    @Override
    public void execute() {
        checkoutBook();
    }

    private void checkoutBook() {
        System.out.println("Enter the book name here : ");
        Scanner scan = new Scanner(System.in);
        Book issuedBook = librarian.getBook(scan.nextLine());
        if (issuedBook != null) {
//            customer.receivedBook(issuedBook);
            System.out.println("Thank you, Enjoy the book\n");
        }

        else System.out.println("That book is not available");
    }
}
