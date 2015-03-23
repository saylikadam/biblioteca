package com.twu.biblioteca;


        import junit.framework.TestCase;

public class BibliotecaTest extends TestCase {

    Customer suhas = new Customer("Suhas");

    public void testWelcomeMessageToUser () {
        String welcomeMessage = "Hello Suhas, Welcome To Biblioteca!";
        assertEquals(welcomeMessage, suhas.getWelcomeMessage());
    }
}
