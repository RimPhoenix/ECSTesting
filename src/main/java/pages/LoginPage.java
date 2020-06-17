package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;


public class LoginPage {

    private static EventFiringWebDriver driver;

    public LoginPage(EventFiringWebDriver driver) {LoginPage.driver = driver;}

    public static void adminlogin() {
       WebElement loginDropDownBtn = driver.findElement(By.xpath("//a[@class='account-dropdown-trigger btn btn-link']"));
       loginDropDownBtn.click();
       WebDriverWait wait = new WebDriverWait(driver, 2);wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("desktop-login-username"))));
       WebElement userName = driver.findElement(By.id("desktop-login-username"));
       userName.sendKeys(Constants.AdminUserName);
       WebElement password = driver.findElement(By.id("desktop-login-password"));
       password.sendKeys(Constants.AdminPassword);
       WebElement loginBtn = driver.findElement(By.xpath("//button[@name='desktop']"));
       loginBtn.click();
        }

    public static void newUserLogin() {
        WebElement loginDropDownBtn = driver.findElement(By.xpath("//a[@class='account-dropdown-trigger btn btn-link']"));
        loginDropDownBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("desktop-login-username"))));
        WebElement userName = driver.findElement(By.id("desktop-login-username"));
        userName.sendKeys(Constants.NewPatientUserName);
        WebElement password = driver.findElement(By.id("desktop-login-password"));
        password.sendKeys(Constants.NewPatientPassword);
        WebElement loginBtn = driver.findElement(By.xpath("//button[@name='desktop']"));
        loginBtn.click();
    }



    }


