package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(new Library());
        biblioteca.initiateLibrary("data/books");
        boolean run = biblioteca.isRunning(args[0], args[1], new Login("data/Login"));
        if (!run) showInvalidUser();
    }

    private static void showInvalidUser() {
        System.out.println("Wrong details...");
        System.exit(0);
    }
}
