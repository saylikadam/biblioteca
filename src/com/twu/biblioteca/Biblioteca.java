package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {

    Library library;

    private void printBookDetails() {
        List<Book> allBooks = library.initiateLibrary();
        for (Book b : allBooks) {
            System.out.println(b.bookDetails());
        }
    }

    private void printHeader() {
        System.out.println("BookName    AuthorName    PublishingYear");
        System.out.println("----------------------------------------");
    }


    public void startApp(Customer customer){
        library = new Library("Thoughtworks");
        System.out.println(customer.getWelcomeMessage());
        List<Book> books = library.initiateLibrary();
        if (books == null) {
            System.out.println("Select a valid option");
        }
        else {
            printHeader();
            printBookDetails();
        }
    }
}
