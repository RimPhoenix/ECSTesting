package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyingProductPage {

    private WebDriver driver;

    public BuyingProductPage(WebDriver driver) {this.driver = driver;}

//    public void uploadFile(){
//        driver.setFileDetector(new LocalFileDetector());
//    }
    private By chooseGlasses = By.xpath("//div[3]//div[1]//img[1]");
    private By addToCart = By.xpath("//a[@class='btn btn-primary add-to-bag']");
    private By ODSphDD = By.name("prescription[od_sph]");
    private Select findODSph() {return new Select(driver.findElement(ODSphDD));}
    private By OSSphDD = By.name("prescription[os_sph]");
    private Select findOSSph() {return new Select(driver.findElement(OSSphDD));}
    private By ODCylDD = By.name("prescription[od_cyl]");
    private Select findODCyl() {return new Select(driver.findElement(ODCylDD));}
    private By OSCylDD = By.name("prescription[os_cyl]");
    private Select findOSCyl() {return new Select(driver.findElement(OSCylDD));}
    private By ODAxisDD = By.name("prescription[od_axis]");
    private Select findODAxis() {return new Select(driver.findElement(ODAxisDD));}
    private By OSAxisDD = By.name("prescription[os_axis]");
    private Select findOSAxis() {return new Select(driver.findElement(OSAxisDD));}
    private By ODAddDD = By.name("prescription[od_add]");
    private Select findODAdd() {return new Select(driver.findElement(ODAddDD));}
    private By OSAddDD = By.name("prescription[os_add]");
    private Select findOSAdd() {return new Select(driver.findElement(OSAddDD));}
    private By PDDD = By.name("prescription[pd]");
    private Select findPD() {return new Select(driver.findElement(PDDD));}
    private By measurePD = By.xpath("//button[contains(text(),'How to measure your PD')]");
    private By doctorsNameField = By.name("prescription[doctor_name]");
    private By dob = By.name("prescription[date_of_birth]");
    private By prescribedDate = By.name("prescription[prescribed_date]");
    private By expirationDate = By.name("prescription[expiration_date]");
    private By uploadRx = By.className("custom-file-input");
    private By addRxBtn = By.xpath("//button[@class='btn btn-secondary']");
    private By chooseGlassesType = By.xpath("//div[5]");
    private By chooseLensesRdoBtn = By.xpath("//li[2]//label[1]//*[local-name()='svg'][2]/*[name()='path'][1]");
    private By continueBtn = By.xpath("//button[@class='btn btn-primary']");
    private By firstNameField = By.id("first_name");
    private By lastNameField = By.id("last_name");
    private By addressField = By.id("address");
    private By cityField = By.id("city");
    private By stateField = By.id("state");
    private By zipCodeField = By.id("zip");
    private By emailField = By.id("email");
    private By phoneField = By.id("phone");
    private By shippingRdoBtn = By.xpath("//li[1]//label[1]//*[local-name()='svg']");
    private By reviewOdrBtn = By.xpath("//button[contains(text(),'Review Your Order')]");
    private By addNote = By.tagName("textarea");
    private By refundCheckBox = By.xpath("//label[contains(text(),'I have read and agree to the')]//*[local-name()='svg']");
    private By creditCardNbr = By.id("sq-card-number");
    private By cardExpDate = By.id("sq-expiration-date");
    private By cardCvvNbr = By.id("sq-cvv");
    private By cardZip = By.id("sq-postal-code");
    private By completeOdrBtn = By.id("sq-creditcard");
    private By contShoppingBtn = By.linkText("Continue Shopping");

    public void setChooseGlasses() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(chooseGlasses));
        driver.findElement(chooseGlasses).click();}

    public void setAddToCart() {WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        driver.findElement(addToCart).click();}

    public void selectODSph(String ODSph){findODSph().selectByVisibleText(ODSph);}

    public void selectOSSph(String OSSph){findOSSph().selectByVisibleText(OSSph);}

    public void selectODCyl(String ODCyl){findODCyl().selectByVisibleText(ODCyl);}

    public void selectOSCyl(String OSCyl){findOSCyl().selectByVisibleText(OSCyl);}

    public void selectODAxis(String ODAxis){findODAxis().selectByVisibleText(ODAxis);}

    public void selectOSAxis(String OSAxis){findOSAxis().selectByVisibleText(OSAxis);}

    public void selectODAdd(String ODAdd){findODAdd().selectByVisibleText(ODAdd);}

    public void selectOSAdd(String OSAdd){findOSAdd().selectByVisibleText(OSAdd);}

    public void selectPD(String PD){findPD().selectByVisibleText(PD);}

    public void setDoctorsNameField(String DrName){driver.findElement(doctorsNameField).sendKeys(DrName);}

    public void setDob(String Dob){driver.findElement(dob).sendKeys(Dob);}

    public void setPrescribedDate(String rxDate){driver.findElement(prescribedDate).sendKeys(rxDate);}

    public void setExpirationDate(String expDate){driver.findElement(expirationDate).sendKeys(expDate);}

    public void setUploadRx(String pathToRx){driver.findElement(uploadRx).sendKeys(pathToRx);}

    public void setAddRxBtn(){driver.findElement(addRxBtn).click();}

    public void setChooseGlassesType(){driver.findElement(chooseGlassesType).click();}

    public void setChooseLensesRdoBtn(){driver.findElement(chooseLensesRdoBtn).click();}

    public void setContinueBtn(){driver.findElement(continueBtn).click();}

    public void setFirstNameField(String firstName){driver.findElement(firstNameField).sendKeys(firstName);}

    public void setLastNameField(String lastName){driver.findElement(lastNameField).sendKeys(lastName);}

    public void setAddressField(String streetAddress){driver.findElement(addressField).sendKeys(streetAddress);}

    public void setCityField(String city){driver.findElement(cityField).sendKeys(city);}

    public void setStateField(String state){driver.findElement(stateField).sendKeys(state);}

    public void setZipCodeField(String zipCode){driver.findElement(zipCodeField).sendKeys(zipCode);}

    public void setEmailField(String email){driver.findElement(emailField).sendKeys(email);}

    public void setPhoneField(String phone){driver.findElement(phoneField).sendKeys(phone);}

    public void setShippingRdoBtn(){driver.findElement(shippingRdoBtn).click();}

    public void setReviewOdrBtn(){driver.findElement(reviewOdrBtn).click();}

    public void setAddNote(String note){driver.findElement(addNote).sendKeys(note);}

    public void setRefundCheckBox(){driver.findElement(refundCheckBox).click();}

    public void setCreditCardNbr(String cardNbr){driver.findElement(creditCardNbr).sendKeys(cardNbr);}

    public void setCardExpDate(String expDate){driver.findElement(cardExpDate).sendKeys(expDate);}

    public void setCardCvvNbr(String cvv){driver.findElement(cardCvvNbr).sendKeys(cvv);}

    public void setCardZip(String zip){driver.findElement(cardZip).sendKeys(zip);}

    public void setCompleteOdrBtn(){driver.findElement(completeOdrBtn).click();}

    public void setContShoppingBtn(){driver.findElement(contShoppingBtn).click();}
}
