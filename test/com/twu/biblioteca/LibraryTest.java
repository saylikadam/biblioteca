package com.twu.biblioteca;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ankurks on 3/21/2015.
 * Test for Library behaviour
 */

public class LibraryTest extends TestCase{

    Library lib = new Library("ThoughtWorks");

    public void testShouldreturnListOfBook() {
        Map<String, Boolean> bookList=lib.initiateLibrary();
        Map<String, Boolean> expected = new HashMap<String, Boolean>();
        expected.put(new Book("Sherlock Holmes", "Sir Canon Doyle", "1990").bookDetails(), true);
        expected.put(new Book("Wings Of Fire", "A P J Abdul Kalam", "1991").bookDetails(), true);
        expected.put(new Book("Ramayana", "Maharshi Valmiki", "700").bookDetails(), true);
        expected.put(new Book("Five Point Someone", "Chetan Bhagat", "1990").bookDetails(), true);
        assertTrue(expected.equals(bookList));
    }

    public void testAddBookShouldAddABookToLibrary(){
        Book book = new Book("Sherlock Holmes", "Sir Canon Doyle","1990");
        List<String> expected = new ArrayList<String>();
        expected.add(book.bookDetails());

        lib.initiateList(book);
        assertEquals(expected, lib.getAvailableList());
//        assertTrue(lib.getAvailableList().contains(book));
        //removing this functionality breakage of encapsulation
    }

    public void testCheckOutBookShouldDeleteTheBookNameFromBookList() {
        Book book=new Book("Sherlock Holmes", "Sir Canon Doyle","1990");
        lib.initiateList(book);
        Book recievedBook = lib.getParticularBook("Sherlock Holmes");
        assertTrue(book.equals(recievedBook));
        assertFalse(lib.getAvailableList().contains(book.bookDetails()));
        assertEquals(0, lib.getAvailableList().size());
    }

}

