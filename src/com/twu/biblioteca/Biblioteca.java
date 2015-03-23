package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

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
        Customer customer;
        try {
            customer = new Customer(args);
            System.out.println(customer.getWelcomeMessage());
            menuHandler();

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No Customer Found");
       }
    }

    private void menuHandler() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            printMenuOption();
            optionHandler(scan.nextInt());
        }
    }

    private void printMenuOption(){
        StringBuilder menu = new StringBuilder();
        menu.append("1. List Books\n");
        menu.append("2. Quit\n");
        System.out.println(menu);
    }

    private void optionHandler(int option) {
        switch(option){
            case 1:
                printTitle();
                printBookDetails();
            case 2:
                System.exit(0);
        }
    }
}
