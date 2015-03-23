package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library lib = new Library("Thoughtworks");
        lib.addBook(new Book("HP", "JK Rowling"));
        Customer customer;

        try {
            customer = new Customer(args[0]);
            System.out.println(customer.getWelcomeMessage());
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write \"List Books\" For Show book list");
            List<Book> books = lib.actOn(scanner.nextLine());
            if (books == null)
                System.out.println("Select a valid option");
            else
                showAllBooks(books);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No Customer Found");
        }
    }

    private static void showAllBooks(List<Book> books) {
        for (Book book : books)
            System.out.println(book);
    }
}
