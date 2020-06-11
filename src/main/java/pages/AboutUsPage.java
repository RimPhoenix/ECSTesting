package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutUsPage {

    private WebDriver driver;
    public AboutUsPage(WebDriver driver){this.driver = driver;}

    private By missionsTripBtn = By.className("mission-trip-button btn btn-lg");

    public void setMissionsTripBtn(){driver.findElement(missionsTripBtn).click();}
}
