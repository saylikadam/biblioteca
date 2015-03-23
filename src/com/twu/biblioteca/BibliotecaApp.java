package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void printBookDetails() {
        Library l = new Library("TW");
        List<Book> allBooks = l.initiateLibrary();
        for (Book b : allBooks) {
            System.out.println(b.bookDetails());
        }
    }

    public static void printTitle() {
        System.out.println("BookName    AuthorName    PublishingYear");
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        Library lib = new Library("Thoughtworks");
        Customer customer;
        try {
            customer = new Customer(args[0]);
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
        } catch (Exception e) {
            System.out.println("No Customer Found");
        }
    }
}
