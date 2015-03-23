package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Library {
    private List<Book> bookList = new ArrayList<Book>();
    private String name;

    public Library(String name) {
        this.name = name;
    }

    public List<Book> getAllBooks() {
        return bookList;
    }

    public List<Book> actOn(String option) {
        if(option.equals("List Books")){
            return bookList;
        }
        return null;
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public List<Book> initiateLibrary(){
        addBook(new Book("Sherlock Holmes", "Sir Canon Doyle", "1990"));
        addBook(new Book("Wings Of Fire", "A P J Abdul Kalam", "1991"));
        addBook(new Book("Ramayana", "Maharshi Valmiki", "700"));
        addBook(new Book("Five Point Someone", "Chetan Bhagat", "1990"));
        return bookList;
    }
}