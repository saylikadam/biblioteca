package com.twu.biblioteca;

import java.util.List;

public class Biblioteca {

    private void printBookDetails() {
        Library l = new Library("TW");
        List<Book> allBooks = l.initiateLibrary();
        for (Book b : allBooks) {
            System.out.println(b.bookDetails());
        }
    }

    private void printTitle() {
        System.out.println("BookName    AuthorName    PublishingYear");
        System.out.println("----------------------------------------");
    }


    public void startApp(String args){
        Library lib = new Library("Thoughtworks");
        Customer customer;
        try {
            customer = new Customer(args);
            System.out.println(customer.getWelcomeMessage());
            List<Book> books = lib.initiateLibrary();
            if (books == null) {
                System.out.println("Select a valid option");
            }
            else {
                printTitle();
                printBookDetails();
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No Customer Found");
        }
    }
}
