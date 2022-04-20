package com.telran.contacts.tests;

import com.telran.contacts.model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {
    //Precondition: user should be out
    @BeforeMethod
    //login tab not present
    public void ensurePreconditions(){
        if(!app.getHeader().isLoginTabPresent()){
            //click log ot button
            app.getHeader().clickOnSignOutButton();
        }
    }

    @Test
    public void registrationPositiveTests(){
        //Test: click on login tab
        app.getUser().clickOnLoginTab();
        app.getUser().isRegistrationFormPresent();
        app.getUser().fillRegistrationLoginForm(new User().setEmail("qjer15@gmail.com").setPassword("Qje36547894321$")); //We need always change email
        //check log out button displayed
        app.getUser().clickOnRegistrationButton();
        app.getHeader().isSignOutButtonPresent();
    }

    @Test
    public void registrationNegativeWithoutPasswordTests(){
        //Test: click on login tab
        app.getUser().clickOnLoginTab();
        app.getUser().isRegistrationFormPresent();
        app.getUser().fillRegistrationLoginForm(new User().setEmail("qjer152@gmail.com"));
        //check log out button displayed
        app.getUser().clickOnRegistrationButton();
        //click on Registration button
        Assert.assertTrue(app.getUser().isAlertPresent());

    }
}
