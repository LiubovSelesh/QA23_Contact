
package com.telran.contacts.tests;

import com.telran.contacts.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        app.getUser().clickOnLoginTab();
        if (!app.getUser().isRegistrationLoginFormPresent()) { // по версии Ирины,
            app.getHeader().clickOnSignOutButton();
        }
    }

    @Test(priority = 1)
    public void loginRegisterUserPositiveTest(){
        app.getUser().fillRegistrationLoginForm(new User().setEmail("qjer152@gmail.com").setPassword("Qje36547894321$"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getHeader().isContactTabPresent());
    }

    @Test(priority = 2)
    public void loginRegisterUserNegativeTest() {
//        clickOnLoginTab();
        app.getUser().fillRegistrationLoginForm(new User().setEmail("qjer152@gmail.com").setPassword("Qje3654789432"));
        app.getUser().clickOnLoginButton();
        Assert.assertTrue(app.getUser().isAlertPresent());

// HW :   assert "Login Failed with code 400" displayed
        Assert.assertTrue(app.getHeader().isContactRegistrationAgain());
    }
}


