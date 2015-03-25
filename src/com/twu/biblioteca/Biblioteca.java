package com.twu.biblioteca;

public class Biblioteca {
    private Library library;

    public Biblioteca(Library library) {
        this.library = library;
        new BookRepository().initiateLibrary(library);
    }


    private void startApp(){
        System.out.println(getWelcomeMessage());
        while(true){
            new Menu().menuHandler(library);
        }
    }

    public String getWelcomeMessage() {
        return " Welcome To Biblioteca\n";
    }

    public void run(String id ,String password) {
        if(new Login().checkLogin(id,password)){
            startApp();
        }
        else{
            System.out.println("Wrong details...");
            System.exit(0);
        }
    }
}
