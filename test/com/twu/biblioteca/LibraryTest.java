package com.twu.biblioteca;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankurks on 3/21/2015.
 */
public class LibraryTest extends TestCase{

    Library lib = new Library("ThoughtWorks");

    public void testShouldreturnListOfBook() {
        List<Book> bookList=lib.initiateLibrary();
        List<Book> expected = new ArrayList<Book>();
        expected.add(new Book("Sherlock Holmes", "Sir Canon Doyle","1990"));
        expected.add(new Book("Wings Of Fire", "A P J Abdul Kalam", "1991"));
        expected.add(new Book("Ramayana", "Maharshi Valmiki", "700"));
        expected.add(new Book("Five Point Someone", "Chetan Bhagat", "1990"));
        assertTrue(expected.containsAll(bookList));
    }

    public void testAddBookShouldAddABookToLibrary(){
        Book book=new Book("Sherlock Holmes", "Sir Canon Doyle","1990");
        lib.addBook(book);
        assertTrue(lib.getAllBooks().contains(book));
    }

}

