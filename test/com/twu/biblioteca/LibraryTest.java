package com.twu.biblioteca;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ankurks on 3/21/2015.
 */
public class LibraryTest extends TestCase{

    Library lib = new Library("ThoughtWorks");

    @Override
    public void setUp() throws Exception {
        lib.addBook(new Book("HP", "JK Rowling"));
    }

    public void testShouldreturnListOfBook() {
        List<Book> expected = new ArrayList<Book>();
        expected.add(new Book("HP", "JK Rowling"));
        assertTrue(expected.containsAll(lib.getAllBooks()));
    }

    public void testShouldTakeBookListOptionAndProvideBookList () {
        List<Book> expected = new ArrayList<Book>();
        expected.add(new Book("HP", "JK Rowling"));
        assertTrue(expected.containsAll(lib.actOn("List Books")));
    }

    public void testShouldGiveErrorOnInvalidOption () {
        List<Book> expected = new ArrayList<Book>();
        expected.add(new Book("HP", "JK Rowling"));
        assertNull(lib.actOn("Invalid Option"));
    }
}
