package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BookTest {
    @Test
    public void testShouldGiveDetailOfBook(){
        Book b1=new Book("Sherlock Holmes", "Sir Canon Doyle", "1990");
        String expected= "Sherlock Holmes"+"    "+"Sir Canon Doyle" +"    "+ "1990";
        assertTrue(expected.equals(b1.bookDetails()));
    }
}
