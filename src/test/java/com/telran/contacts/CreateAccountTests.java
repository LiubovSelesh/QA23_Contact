package com.telran.contacts;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    //Precondition: user should be out
    @BeforeMethod
    //login tab not present
    public void ensurePreconditions(){
        if(!isElementPresent(By.xpath("//a[contains(.,'LOGIN')]"))){
            //click log ot button
            click(By.xpath("//button[contains(.,'Sign Out')]"));
        }
    }
    @Test
    public void registrationPositiveTests(){
        //Test: click on login tab
//        driver.findElement(By.xpath("//a[contains(.,'LOGIN')]")).click();
        click(By.xpath("//a[contains(.,'LOGIN')]"));
//        Assert.assertTrue(isElementPresent2(By.cssSelector(".login_login__3EHKB")));
        isRegistrationFprmPresent();

        //fill registration form
//        driver.findElement(By.cssSelector("[placeholder='Email']")).click();
//        driver.findElement(By.cssSelector("[placeholder='Email']")).clear();
//        driver.findElement(By.cssSelector("[placeholder='Email']")).sendKeys("qjer152@gmail.com");

//        type(By.cssSelector("[placeholder='Email']"), "qjer152@gmail.com");
//        type(By.cssSelector("[placeholder='Password']"), "Qje36547894321$");
        fillRegistrationLoginForm("qjer152@gmail.com", "Qje36547894321$");
//        driver.findElement(By.cssSelector("[placeholder='Password']")).click();
//        driver.findElement(By.cssSelector("[placeholder='Password']")).clear();
//        driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys("Qje36547894321$");


        //check log out button displayed
        click(By.xpath("//button[contains(.,' Registration')]"));
        //click on Registration button
        isSignOutButtonPresent();

    }

}
