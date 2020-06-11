package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTests {



    @Test
    public void login(){
        LoginPage.adminlogin();
    }
}
