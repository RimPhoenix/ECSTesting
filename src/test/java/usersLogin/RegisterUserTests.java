package usersLogin;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegisterUserPage;

public class RegisterUserTests extends BaseTests {


    @Test
    public void testRegistering(){

        String username = ("Test" + loginDateAndTime + "@mailinator.com");
        RegisterUserPage registerUserPage = homePage.clickRegisterUser();
        registerUserPage.setRegisterUsernameField(username);
        registerUserPage.setPasswordField("Se1enium!");
        registerUserPage.setRegisterLink();
        getWindowManager().switchToNewTab();
        driver.get("https://www.mailinator.com/");
        driver.findElement(By.id("addOverlay")).sendKeys(username + Keys.ENTER);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//td[contains(text(),'Success Vision Express')]")).click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//body[@id='InboxCtrl']/div/div/div/div/div[@id='msgpane']/div/div[1]")).click();
        driver.findElement(By.cssSelector("body.nav-md.ng-scope:nth-child(2) div.container.body:nth-child(2) div.main_container div.right_col:nth-child(3) div.row:nth-child(9) div.col-md-12.col-sm-12.col-xs-12 div.x_panel tbody:nth-child(1) tr:nth-child(6) td:nth-child(2) div:nth-child(1) > button.btn.btn-xs.btn-dark:nth-child(1)")).click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.switchTo().frame("msg_body");
        driver.findElement(By.partialLinkText("https://successvisio")).click();


    }



}
