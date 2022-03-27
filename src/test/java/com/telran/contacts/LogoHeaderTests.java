package com.telran.contacts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogoHeaderTests extends TestBase {

    @Test
    public void checkLogoPhonebook(){
        System.out.println("Phonebook");
        isElementPresent(By.xpath("//h1[contains(.,'PHONEBOOK')]"));
        System.out.println("Logo Phonebook: " + isElementPresent(By.xpath("//h1[contains(.,'PHONEBOOK')]")));


    }
}
