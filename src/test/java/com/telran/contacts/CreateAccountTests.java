package com.telran.contacts;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    //Precondition: user should be out
    @BeforeMethod
    //login tab not present
    public void ensurePreconditions(){
        if(!isLoginTabPresent()){
            //click log ot button
            clickOnSignOut();
        }
    }

    @Test(enabled = false)
    public void registrationPositiveTests(){
        //Test: click on login tab
        clickOnLoginTab();
        isRegistrationFormPresent();
        fillRegistrationLoginForm("qjer152@gmail.com", "Qje36547894321$");
        //check log out button displayed
        clickOnRegistrationButton();
        //click on Registration button
        isSignOutButtonPresent();

    }

}
