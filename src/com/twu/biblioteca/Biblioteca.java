package com.twu.biblioteca;

public class Biblioteca {
    private Library library;

    Biblioteca(Library library) {
        this.library = library;
    }

    public void initiateLibrary(String booksPath) {
        new BookRepository(booksPath).initiateLibrary(library);
    }

    private boolean startApp(){
        System.out.println(getWelcomeMessage());

        while(true){
            new Menu().menuHandler(library);
        }
    }

    public String getWelcomeMessage() {
        return "Welcome To Biblioteca\n";
    }

    public boolean isRunning(String id, String password, Login login) {
        return login.checkLogin(id, password) && startApp();
    }
}
