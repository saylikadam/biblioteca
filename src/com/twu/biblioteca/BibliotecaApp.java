package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {



    public static void main(String[] args) {
        Customer customer;

        try {
            customer = new Customer(args[0]);
            System.out.println(customer.getWelcomeMessage());
        } catch (Exception e) {
            System.out.println("No Customer Found");
        }
    }
}
