package com.twu.biblioteca;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getWelcomeMessage() {
        return "Hello " + name + ", Welcome To Biblioteca\n";
    }
}
