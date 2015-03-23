package com.twu.biblioteca;

/**
 * Created by saylik on 3/21/2015.
 * Customer class which contains the behaviour of the user
 */
public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getWelcomeMessage() {
        return "Hello " + name + ", Welcome To Biblioteca";
    }
}
