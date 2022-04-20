package com.telran.contacts.fw;

import com.telran.contacts.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class UserHelper extends HelperBase{
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void isRegistrationFormPresent() {
        Assert.assertTrue(isElementPresent2(By.cssSelector(".login_login__3EHKB")));
    }
    public void clickOnRegistrationButton() {
        click(By.xpath("//button[contains(.,' Registration')]"));
    }

    public void fillRegistrationLoginForm(User user) {
        type(By.cssSelector("[placeholder='Email']"), user.getEmail());
        type(By.cssSelector("[placeholder='Password']"), user.getPassword());
    }

    public void login() {
//        click(By.xpath("//a[contains(.,'LOGIN')]"));
        clickOnLoginTab();
        fillRegistrationLoginForm(new User().setEmail("qjer152@gmail.com").setPassword("Qje36547894321$"));
        click(By.xpath("//button[contains(.,' Login')]"));
    }

    public void clickOnLoginTab() {
        click(By.xpath("//a[contains(.,'LOGIN')]"));
    }



    public boolean isRegistrationLoginFormPresent() {
        return isElementPresent2(By.cssSelector(".login_login__3EHKB"));
    }

    public void clickOnLoginButton() {
        click(By.xpath("//button[contains(.,' Login')]"));
    }
}
