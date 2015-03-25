package com.twu.biblioteca;

/**
 * Created by kaustavc on 3/24/2015.
 */
public class Quit implements Option {

    @Override
    public void execute() {
        System.out.println("Thank You! Keep Reading Books.");
        System.exit(0);
    }
}
