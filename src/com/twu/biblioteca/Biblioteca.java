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

    private void printTitle() {
        System.out.println("BookName    AuthorName    PublishingYear");
        System.out.println("----------------------------------------");
    }


    public void startApp(String args){
        library = new Library("Thoughtworks");
        Customer customer;
        try {
            customer = new Customer(args);
            System.out.println(customer.getWelcomeMessage());
            List<Book> books = library.initiateLibrary();
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
