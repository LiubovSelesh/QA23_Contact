package com.telran.contacts.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHelper extends HelperBase{
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isHomeComponentPresent() {
        return isElementPresent(By.cssSelector("div:nth-child(2) > div > div"));
    }
}
