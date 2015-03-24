package com.twu.biblioteca;

import java.util.*;

public class Library {
    private List<Book> books;
    private Map<String, Boolean> bookList;
    private String name;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<Book>();
        bookList = new HashMap<String, Boolean>();
    }

    public List<String> getAvailableList() {
        List<String> availableList = new ArrayList<String>();

        for (String bookDetail : bookList.keySet()) {
            if (bookList.get(bookDetail))
                availableList.add(bookDetail);
        }

        return availableList;
    }

    public void initiateList(Book book){

        books.add(book);
        addInList(book);
    }

    public Map<String, Boolean> initiateLibrary(){
        initiateList(new Book("Sherlock Holmes", "Sir Canon Doyle", "1990"));
        initiateList(new Book("Wings Of Fire", "A P J Abdul Kalam", "1991"));
        initiateList(new Book("Ramayana", "Maharshi Valmiki", "700"));
        initiateList(new Book("Five Point Someone", "Chetan Bhagat", "1990"));
        return bookList;
    }

    private void addInList(Book book) {

        bookList.put(book.bookDetails(), true);
    }

    public Book getParticularBook(String bookName) {
        for (Book book : books) {
            if(book.isName(bookName)){
                bookList.replace(book.bookDetails(), false);
                return book;
            }
        }

        return null;
    }
}