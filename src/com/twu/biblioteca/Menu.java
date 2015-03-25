package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    public void menuHandler(Library library) {
        Scanner scan = new Scanner(System.in);
        printMenuOption();
        optionHandler(scan.nextInt(), library);
    }

    private void printMenuOption() {
        StringBuilder menu = new StringBuilder();
        menu.append("1. List Books\n");
        menu.append("2. Checkout Book\n");
        menu.append("3. Return Book\n");
        menu.append("4. Quit\n\n\n");
        menu.append("Enter your choice : \n");
        System.out.println(menu);
    }

    private void optionHandler(int option, Library library) {
        new OptionMapper(library).getExecutive(option).execute();
    }
}