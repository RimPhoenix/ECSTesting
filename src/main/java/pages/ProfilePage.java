package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    private WebDriver driver;

    public ProfilePage(WebDriver driver) {this.driver = driver;}

    private By createProfileBtn = By.linkText("Create Profile");
    private By nameField = By.name("profile[name]");
    private By chooseAvatar = By.xpath("//div[7]//label[1]//*[local-name()='svg']");
    private By commitBtn = By.xpath("commit");
    private By newPerscriptionRdoBtn = By.xpath("//label[@class='custom-control-label']");
    private By ODSph = By.name("custom_prescription[od_sph]");
    private By OSSph = By.name("custom_prescription[os_sph]");
    private By ODCyl = By.name("custom_prescription[od_cyl]");
    private By OSCyl = By.name("custom_prescription[os_cyl]");
    private By ODAxis = By.name("custom_prescription[od_axis]");
    private By OSAxis = By.name("custom_prescription[os_axis]");
    private By ODAdd = By.name("custom_prescription[od_add]");
    private By OSAdd = By.name("custom_prescription[os_add]");
    private By measurePDBtn = By.xpath("//button[@class='btn btn-secondary measure-pd-button btn-block collapsed']");
    private By PD = By.name("custom_prescription[pd]");
    private By doctorsNameField = By.name("custom_prescription[doctor_name]");
    private By dob = By.name("custom_prescription[date_of_birth]");
    private By typeList = By.name("custom_prescription[rx_type]");
    private By prescribedDate = By.name("custom_prescription[prescribed_date]");
    private By expirationDate = By.name("custom_prescription[expiration_date]");
    private By uploadRx = By.id("rx-file-upload-prepender");
    private By createRxBtn = By.xpath("//button[contains(text(),'Create with Prescription')]");




}
