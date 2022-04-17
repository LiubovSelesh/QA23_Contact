package com.telran.contacts;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        if (!isSignOutBtnPresent()){
            login();
        }
    }

    @Test
    public void addContactPositiveTest(){
        addContact();
        Assert.assertTrue(isContactCreated("Norma"));

    }
}
