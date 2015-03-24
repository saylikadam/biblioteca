package com.twu.biblioteca;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Biblioteca {

    private Librarian librarian;
    private Library library;
    private Customer customer;

    public void startApp(Customer customer){
        this.customer = customer;
        library = new Library("ThoughtWorks");
        initiateLibrary();
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

    private void initiateLibrary() {
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
        menu.append("3. Return Book\n");
        menu.append("4. Quit\n");
        System.out.println(menu);
    }

    private void optionHandler(int option) {
        new OptionMapper(library, librarian).getExecutive(option).execute();
    }

}
