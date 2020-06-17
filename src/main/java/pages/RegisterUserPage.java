package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterUserPage {

    WebDriver driver;

    public RegisterUserPage(WebDriver driver){this.driver = driver;}

    private By registerUsernameField = By.id("register-login-username");
    private By registerLink = By.name("register");
    private By passwordField = By.id("register-login-password");


    public void setRegisterUsernameField(String userName){driver.findElement(registerUsernameField).sendKeys(userName);}

    public void setRegisterLink(){driver.findElement(registerLink).click();}

    public void setPasswordField(String password){driver.findElement(passwordField).sendKeys(password);}



}
