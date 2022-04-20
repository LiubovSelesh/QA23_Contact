package com.telran.contacts.tests;

import com.telran.contacts.model.Contact;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase {

    @BeforeMethod
    public void ensurePrecondition(){
        if (!app.getHeader().isSignOutBtnPresent()){
            app.getUser().login();
        }
        int i = (int) ((System.currentTimeMillis() / 1000)%3600);
        app.getContact().addContact(new Contact().setName("Norma").setLastName("Miller").setPhone("123456" + i).setEmail("norma" + i + "@gmail.com").setAddress("Berlin").setDescription("Friend"));
    }

    @Test
    public void removeContactTest() throws InterruptedException {
        int sizeBefore = app.getContact().sizeOfContacts();
        System.out.println(sizeBefore);
        app.getContact().removeContact();
        Thread.sleep(2000);                                       //пауза, что бы селениум успел посчитать
        int sizeAfter = app.getContact().sizeOfContacts();
        System.out.println(sizeAfter);
        Assert.assertEquals(sizeAfter, sizeBefore - 1);
    }
}
