
package com.telran.contacts;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTests extends TestBase{

    @BeforeMethod
    public void ensurePreconditions() {
        clickOnLoginTab();
        if (!isRegistrationLoginFormPresent()) { // по версии Ирины,
            clickOnSignOutButton();
        }
    }

    @Test(priority = 1)
    public void loginRegisterUserPositiveTest(){
        fillRegistrationLoginForm("qjer152@gmail.com", "Qje36547894321$");
        clickOnLoginButton();
        Assert.assertTrue(isContactTabPresent());
    }

    @Test(priority = 2)
    public void loginRegisterUserNegativeTest() {
//        clickOnLoginTab();
        fillRegistrationLoginForm("qjer152@gmail.com", "Qje3654789432");
        clickOnLoginButton();
        Assert.assertTrue(isAlertPresent());

// HW :   assert "Login Failed with code 400" displayed
        Assert.assertTrue(isContactRegistrationAgain());
    }
}


