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

    public void testAddBookShouldAddABookToLibrary(){
        Book book = new Book("Sherlock Holmes", "Sir Canon Doyle","1990");
        List<String> expected = new ArrayList<String>();
        expected.add(book.bookDetails());

        lib.initiateList(book);
        assertEquals(expected, lib.getAvailableList());
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

