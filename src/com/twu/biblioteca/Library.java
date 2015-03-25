package com.twu.biblioteca;

import java.util.*;

public class Library {
    private List<Book> books;
    private Map<String, Boolean> bookList;

    public Library() {
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

    private void addInList(Book book) {
        bookList.put(book.bookDetails(), true);
    }

    public Book getBook(String bookName) {
        for (Book book : books) {
            if(book.isName(bookName) && bookList.get(book.bookDetails())){
                bookList.replace(book.bookDetails(), false);
                return book;
            }
        }
        return null;
    }

    public boolean returnBook(String bookName) {
        for (Book book : books) {
            if(book.isName(bookName) && !bookList.get(book.bookDetails())){
                bookList.replace(book.bookDetails(), true);
                return true;
            }
        }
        return false;
    }
}