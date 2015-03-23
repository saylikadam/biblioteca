package com.twu.biblioteca;

public class BibliotecaApp {


    public static void main(String[] args) {
        try {
            Customer customer = new Customer(args[0]);
            new Biblioteca().startApp(customer);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No user found");
        }
    }
}
