package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private Librarian librarian;
    private Library library;
    private Customer customer;

    private void printBookDetails() {
        List<String> allBooks = library.getAvailableList();
        for (String b : allBooks) {
            System.out.println(b);
        }
    }

    private void printTitle() {
        System.out.println("BookName    AuthorName    PublishingYear");
        System.out.println("----------------------------------------");
    }

    public void startApp(Customer customer){
        this.customer = customer;
        library = new Library("ThoughtWorks");
        initiateLibrary("data/books");
        librarian = new Librarian("Vikas", library);
        System.out.println(customer.getWelcomeMessage());

        while(true){
            try {
                menuHandler();

            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("No Customer Found");
            }
        }
    }

    private void initiateLibrary(String books) {
        FileScanner fileScanner = new FileScanner("data/books");
        String contents = fileScanner.read();
        String[] lines = contents.split(System.lineSeparator());
        for (String line : lines) {
            String[] values = splitByComma(line);
            library.initiateList(new Book(values[0], values[1], values[2]));
        }
    }

    private String[] splitByComma(String line) {
        String[] words = line.split(",");
        String[] updatedWords = new String[words.length];
        for (int count = 0; count < words.length; count++) {
            updatedWords[count] = words[count].trim();
        }
        return updatedWords;
    }

    private void menuHandler() {
        Scanner scan = new Scanner(System.in);
        printMenuOption();
        optionHandler(scan.nextInt());
    }

    private void printMenuOption(){
        StringBuilder menu = new StringBuilder();
        menu.append("1. List Books\n");
        menu.append("2. Checkout Book\n");
        menu.append("3. Quit\n");
        System.out.println(menu);
    }

    private void optionHandler(int option) {
        switch(option){
            case 1:
                printTitle();
                printBookDetails();
                return;
            case 2:
                checkoutBook();
                return;
            case 3:
                System.exit(0);
        }
    }

    private void checkoutBook() {
        System.out.println("Enter the book name here : ");
        Scanner scan = new Scanner(System.in);
        Book issuedBook = librarian.getBook(scan.nextLine());
        if (issuedBook != null) {
            customer.receivedBook(issuedBook);
            System.out.println("Thank you, Enjoy the book");
        }

        else System.out.println("That book is not available");
    }

}
