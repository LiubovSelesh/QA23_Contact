package com.telran.contacts.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase {

    @Test
    public void checkLogoPhonebook(){
        System.out.println("Phonebook");
        app.getContact().isElementPresent(By.xpath("//h1[contains(.,'PHONEBOOK')]"));
        System.out.println("Logo Phonebook: " + app.getContact().isElementPresent(By.xpath("//h1[contains(.,'PHONEBOOK')]")));

    }

    @Test
    public void checkLogoHome() {
        System.out.println("HOME");
        app.getContact().isElementPresent(By.xpath("//a[contains(.,'HOME')]"));
        System.out.println("Logo HOME: " + app.getContact().isElementPresent(By.xpath("//a[contains(.,'HOME')]")));

    }
}
