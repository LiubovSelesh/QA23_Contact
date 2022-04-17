package com.telran.contacts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeaderTests extends TestBase {

    @Test
    public void checkLogoPhonebook(){
        System.out.println("Phonebook");
        isElementPresent(By.xpath("//h1[contains(.,'PHONEBOOK')]"));
        System.out.println("Logo Phonebook: " + isElementPresent(By.xpath("//h1[contains(.,'PHONEBOOK')]")));

    }

    @Test
    public void checkLogoHome() {
        System.out.println("HOME");
        isElementPresent(By.xpath("//a[contains(.,'HOME')]"));
        System.out.println("Logo HOME: " + isElementPresent(By.xpath("//a[contains(.,'HOME')]")));

    }
}
