package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage {


    private WebDriver driver;

    public ContactUsPage(WebDriver driver) {this.driver = driver;}

    private By firstNameField = By.id("first_15");
    private By lastNameField = By.id("last_15");
    private By emailField = By.id("input_16");
    private By areaCodeField = By.id("input_19_area");
    private By phoneNumberField = By.id("input_19_phone");
    private By locationSelection = By.id("input_20");
    private Select selectLocation(){return new Select(driver.findElement(locationSelection));}
    private By messageField = By.id("input_17");
    private By submitBtn = By.id("input_14");


    public void setFirstNameField(String firstName){WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(firstNameField));
        driver.findElement(firstNameField).sendKeys(firstName);}
    public void setLastNameField(String lastName){driver.findElement(lastNameField).sendKeys(lastName);}
    public void setEmailField(String email){driver.findElement(emailField).sendKeys(email);}
    public void setAreaCodeField(String areaCode){driver.findElement(areaCodeField).sendKeys(areaCode);}
    public void setPhoneNumberField(String phoneNumber){driver.findElement(phoneNumberField).sendKeys(phoneNumber);}
    public void setLocationSelection(String location){selectLocation().selectByValue(location);}
    public void setMessageField(String message){driver.findElement(messageField).sendKeys(message);}
    public void setSubmitBtn(){driver.findElement(submitBtn).click();}


}
