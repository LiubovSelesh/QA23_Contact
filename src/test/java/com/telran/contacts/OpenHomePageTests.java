package com.telran.contacts;


import org.testng.annotations.Test;

public class OpenHomePageTests extends TestBase {

    @Test
    public void openHomePageTest() {
        System.out.println("Opened home page");

        isHomeComponentPresent();
        System.out.println("Home Component: " + isHomeComponentPresent());
    }

}
