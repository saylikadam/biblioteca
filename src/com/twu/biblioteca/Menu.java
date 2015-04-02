package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

    public void menuHandler(Library library, int choice) {
        optionHandler(choice, library);
    }

    public String getContextMenu(Library library) {
        StringBuilder options = new OptionMapper(library).getOptionList();
        options.append("Enter your choice : ");
        return options.toString();
    }

    private void optionHandler(int option, Library library) {
        new OptionMapper(library).getExecutive(option).execute();
    }
}