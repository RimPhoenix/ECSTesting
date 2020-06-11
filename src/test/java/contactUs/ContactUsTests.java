package contactUs;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUsPage;

public class ContactUsTests extends BaseTests {


    @Test

    public void fillOutContactUsForm(){

        ContactUsPage contactUsPage = homePage.clickContactUs();
        driver.switchTo().frame(driver.findElement(By.id("63153856209156")));
        contactUsPage.setFirstNameField("Auto");
        contactUsPage.setLastNameField("Test");
        contactUsPage.setEmailField("autoTest@autotest.com");
        contactUsPage.setAreaCodeField("555");
        contactUsPage.setPhoneNumberField("555-5555");
        contactUsPage.setLocationSelection("Conway, AR");
        contactUsPage.setMessageField("Disregard this message, this is from an automated test");
        contactUsPage.setSubmitBtn();


    }
}
