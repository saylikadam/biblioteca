package com.twu.biblioteca;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class Quit implements Option {

    private final String name;

    public Quit(String name) {

        this.name = name;
    }

    @Override
    public void execute() {
        System.out.println("Thank You! Keep Reading Books.");
        System.exit(0);
    }

    @Override
    public String getOptionName() {
        return name;
    }
}
