package com.telran.contacts.fw;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class HelperBase {
    //    static WebDriver driver;
        WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver =driver;
    }

    public boolean isElementPresent(By locator){          //это универсалный метод
        return driver.findElements(locator).size() > 0;
    }

    public boolean isElementPresent2(By by){
        try{
            driver.findElement(by);
            return true;
        }catch (NoSuchElementException ex){
            return false;
        }
    }

    public void type(By locator, String text) {
        if (text != null) {
            driver.findElement(locator).click();
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public boolean isAlertPresent() {
        Alert alert = new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent());
        if (alert == null) {
            return false;
        } else {
            driver.switchTo().alert();
            alert.accept();
            return true;
        }
    }

    public void jumpToFooter(By locator) {
        driver.findElement(locator).sendKeys(Keys.CONTROL, Keys.END);
    }

    public void clickWithActions(By save) {

        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(save);

        actions.moveToElement(element).build().perform();
        element.click();
    }
}
