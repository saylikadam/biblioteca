package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoginTest {

    Login login = new Login("test-data/login");
    @Test
    public void TestCheckLoginWillReturnFalseForWrongIdAndPassword() {
        assertFalse(login.checkLogin("123","123"));
    }

    @Test
    public void TestCheckLoginWillReturnTrueForWrongIdAndPassword() {
        assertTrue(login.checkLogin("1","A"));
    }
}