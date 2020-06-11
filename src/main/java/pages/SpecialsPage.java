package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SpecialsPage {

    private WebDriver driver;

    public SpecialsPage(WebDriver driver) {this.driver = driver;}

    private By specialCode1 = By.xpath("//div[@class='current-specials']//div[1]//a[1]");
    private By specialCode2 = By.xpath("//div[@class='current-specials']//div[2]//a[1]");
    private By specialCode3 = By.xpath("//div[@class='current-specials']//div[3]//a[1]");
    private By specialCode4 = By.xpath("//div[@class='current-specials']//div[4]//a[1]");
    private By specialCode5 = By.xpath("//div[@class='current-specials']//div[5]//a[1]");


    public void setSpecialCode1(){driver.findElement(specialCode1).click();}
    public void setSpecialCode2(){driver.findElement(specialCode2).click();}
    public void setSpecialCode3(){driver.findElement(specialCode3).click();}
    public void setSpecialCode4(){driver.findElement(specialCode4).click();}
    public void setSpecialCode5(){driver.findElement(specialCode5).click();}


}
