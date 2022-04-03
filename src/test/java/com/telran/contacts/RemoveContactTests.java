package com.telran.contacts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveContactTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        if (!isSignOutBtnPresent()){
            login();
        }
        addContact();
    }

    @Test
    public void removeContactTest() throws InterruptedException {
        int sizeBefore = sizeOfContacts();
        System.out.println(sizeBefore);
        removeContact();
        Thread.sleep(2000);                                       //пауза, что бы селениум успел посчитать
        int sizeAfter = sizeOfContacts();
        System.out.println(sizeAfter);
        Assert.assertEquals(sizeAfter, sizeBefore - 1);
    }

}
