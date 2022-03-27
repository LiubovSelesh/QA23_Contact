package com.telran.contacts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{

        //Precondition: user should be out
        @BeforeMethod
        //login tab not present
        public void ensurePreconditions() {
            if (!isElementPresent(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[1]"))) {
                //click log ot button
                click(By.xpath("//button[contains(.,'Sign Out')]"));
            }
        }
        @Test
    public void loginRegisterUserPositiveTest(){
            //click on Login tab
            click(By.xpath("//a[contains(.,'LOGIN')]"));
            //fil login form;
            fillRegistrationLoginForm("qjer152@gmail.com", "Qje36547894321$");
            //click on Login button
            click(By.xpath("//button[contains(.,' Login')]"));
            //Assert: User logged in
            Assert.assertTrue(isElementPresent(By.xpath("//a[contains(.,'CONTACTS')]")));

        }

    //
}
