package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by kaustavc on 3/23/2015.
 * LibrarianTest to test the behaviour of the librarian
 */
public class LibrarianTest {

    Library thoughtWorks;
    Librarian sandy;

    @Before
    public void setUp() throws Exception {
        thoughtWorks = new Library("ThoughtWorks");
        sandy = new Librarian("Sandy", thoughtWorks);
    }

    @Test
    public void testLibrarianShouldAbleToLogABook() {
        Book expected = new Book("Sherlock Holmes", "Sir Canon Doyle", "1990");
        thoughtWorks.initiateList(expected);
        assertTrue(expected.equals(sandy.getBook("Sherlock Holmes")));
    }
}
