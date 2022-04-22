package com.telran.contacts.tests;


import com.telran.contacts.model.Contact;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddContactTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getHeader().isSignOutBtnPresent()){
            app.getUser().login();
        }
    }

    @Test
    public void addContactPositiveTest(){

        int i = (int) ((System.currentTimeMillis() / 1000)%3600);
        app.getContact().addContact(new Contact().setName("Norma").setLastName("Miller").setPhone("123456" + i)
                .setEmail("norma" + i + "@gmail.com").setAddress("Berlin").setDescription("Friend"));
        Assert.assertTrue(app.getContact().isContactCreated("Norma"));

    }
    @Test
    public void addContactNegativeWithoutEmailTest(){

        int i = (int) ((System.currentTimeMillis() / 1000)%3600);
        app.getContact().addContact(new Contact().setName("Norma").setLastName("Miller").setPhone("123456" + i)
                .setAddress("Berlin").setDescription("Friend"));
       Assert.assertTrue(app.getContact().isSaveBtnPresent());

    }
}
 