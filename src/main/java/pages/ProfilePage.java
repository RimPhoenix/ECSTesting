package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {

    private WebDriver driver;

    public ProfilePage(WebDriver driver) {this.driver = driver;}

    private By createRxProfileBtn = By.xpath("//a[@class='btn btn-primary']");
    private By nameField = By.name("profile[name]");
    private By newPrescriptionRdoBtn = By.xpath("//label[contains(text(),'New Prescription')]");
    private By chooseAvatar = By.xpath("//div[7]//label[1]//*[local-name()='svg']//*[name()='path' and contains(@fill,'currentCol')]");
    private By commitBtn = By.xpath("commit");
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
    private By typeList = By.name("prescription[rx_type]");
    private By prescribedDate = By.name("prescription[prescribed_date]");
    private By expirationDate = By.name("prescription[expiration_date]");
    private By uploadRx = By.className("custom-file-input");
    private By createRxBtn = By.xpath("//button[contains(text(),'Create with Prescription')]");

    public void setCreateRxProfileBtn(){driver.findElement(createRxProfileBtn).click();}

    public void setNameField(String userName){WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(nameField));
        driver.findElement(nameField).sendKeys(userName);}

    public void setNewPrescriptionRdoBtn(){driver.findElement(newPrescriptionRdoBtn).click();}

    public void setChooseAvatar(){driver.findElement(chooseAvatar).click();}

    public void selectODSph(String ODSph){findODSph().selectByVisibleText(ODSph);}

    public void selectOSSph(String OSSph){findOSSph().selectByVisibleText(OSSph);}

    public void selectODCyl(String ODCyl){findODCyl().selectByVisibleText(ODCyl);}

    public void selectOSCyl(String OSCyl){findOSCyl().selectByVisibleText(OSCyl);}

    public void selectODAxis(String ODAxis){findODAxis().selectByVisibleText(ODAxis);}

    public void selectOSAxis(String OSAxis){findOSAxis().selectByVisibleText(OSAxis);}

    public void selectODAdd(String ODAdd){findODAdd().selectByVisibleText(ODAdd);}

    public void selectOSAdd(String OSAdd){findOSAdd().selectByVisibleText(OSAdd);}

    public void selectPD(String PD){findPD().selectByVisibleText(PD);}

    public void setMeasurePD(){driver.findElement(measurePD).click();}

    public void setDoctorsNameField(String DrName){driver.findElement(doctorsNameField).sendKeys(DrName);}

    public void setDob(String Dob){driver.findElement(dob).sendKeys(Dob);}

    public void setPrescribedDate(String rxDate){driver.findElement(prescribedDate).sendKeys(rxDate);}

    public void setExpirationDate(String expDate){driver.findElement(expirationDate).sendKeys(expDate);}

    public void setUploadRx(String Rx){driver.findElement(uploadRx).sendKeys(Rx);}

    public void setCreateRxBtn(){driver.findElement(createRxBtn).click();}

}
