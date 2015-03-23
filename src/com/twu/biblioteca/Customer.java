package com.twu.biblioteca;

public class Customer {
    private String name;
    private Book book;

    public Customer(String name) {
        this.name = name;
    }

    public String getWelcomeMessage() {
        return "Hello " + name + ", Welcome To Biblioteca\n";
    }

    public void receivedBook(Book book) {

        this.book = book;
    }
}
