package com.telran.contacts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LogoHomeTests  extends TestBase{


    @Test
    public void checkLogoPhonebook() {
        System.out.println("HOME");
        isElementPresent(By.xpath("//a[contains(.,'HOME')]"));
        System.out.println("Logo HOME: " + isElementPresent(By.xpath("//a[contains(.,'HOME')]")));

    }
}

