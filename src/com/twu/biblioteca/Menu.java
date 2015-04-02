package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    public void menuHandler(Library library) {
        Scanner scan = new Scanner(System.in);
        printMenuOption(library);
        optionHandler(scan.nextInt(), library);
    }

    private void printMenuOption(Library library) {
        StringBuilder options = new OptionMapper(library).getOptionList();
        options.append("Enter your choice : ");
        System.out.println(options);
    }

    private void optionHandler(int option, Library library) {
        new OptionMapper(library).getExecutive(option).execute();
    }
}