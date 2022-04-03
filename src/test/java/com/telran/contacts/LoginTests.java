
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
        clickOnLoginTab();
        if (!isRegistrationLoginFormPresent()) { // по версии Ирины,
//        if (!isElementPresent(By.xpath("//body/div[@id='root']/div[2]/div[1]"))) { //Моя версия

            //click log ot button
            clickOnSignOut();
        }
    }

    @Test(priority = 1)
    public void loginRegisterUserPositiveTest(){
        //click on Login tab
//        click(By.xpath("//a[contains(.,'LOGIN')]"));              // по версии Ирины,надо перенести в 19 строку,
        //fil login form;
        fillRegistrationLoginForm("qjer152@gmail.com", "Qje36547894321$");
        //click on Login button
        clickOnLoginButton();
        //Assert: User logged in
        Assert.assertTrue(isContactNabPresent());
//        Assert.assertTrue(isContactRegistrationAgain());
//   HW :   assert "Login Failed with code 400" displayed
//        Alert.assert

    }
//    public boolean isContactRegistrationAgain() {
//        return isElementPresent(By.xpath("//div[contains(.,'Registration failed with code 409')]"));
//    }

    @Test(priority = 2)
    public void loginRegisterUserNegativeTest() {
        clickOnLoginTab();
        fillRegistrationLoginForm("qjer152@gmail.com", "Qje3654789432");
        clickOnLoginButton();
        Assert.assertTrue(isAlertPresent());

    }
}

//    public void removeContact() {
//        if (!isContactListEmpty()){
//            driver.findElement(By.cssSelector(".contact-item_card__2SOIM")).click();
//            driver.findElement(By.xpath("//*[text()='Remove']")).click();
//        }
//    }


