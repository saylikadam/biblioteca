package com.twu.biblioteca;

import java.util.ArrayList;
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

    public Book getParticularBook(String bookName) {
        for (Book book : bookList) {
            if(book.isName(bookName)){
                return book;
            }
        }
        return null;
    }

}