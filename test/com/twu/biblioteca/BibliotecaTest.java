package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Phoenix on 02/04/2015.
 */
public class BibliotecaTest {

    private Biblioteca biblioteca;

    @Before
    public void setUp() {

        biblioteca = new Biblioteca(new Library());
    }

    @Test
    public void testGetWelcomeMessage() {
        String expected = "Welcome To Biblioteca\n";
        assertEquals(expected, biblioteca.getWelcomeMessage());
    }

    @Test
    public void testRunShouldReturnFalseForInvalidUser() {
        assertFalse(biblioteca.isRunning("A", "2", new Login("test-data/login")));
    }
}