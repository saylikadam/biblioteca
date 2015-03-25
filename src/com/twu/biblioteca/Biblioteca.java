package com.twu.biblioteca;

public class Biblioteca {
    private Library library;

    public Biblioteca(Library library) {
        this.library = library;
        new BookRepository().initiateLibrary(library);
    }

    public void startApp(){
        System.out.println(getWelcomeMessage());
        while(true){
            new Menu().menuHandler(library);
        }
    }

    public String getWelcomeMessage() {
        return " Welcome To Biblioteca\n";
    }

}
