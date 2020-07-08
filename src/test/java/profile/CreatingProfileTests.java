package profile;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

import java.util.Calendar;

public class CreatingProfileTests extends BaseTests {

@Test

    public void createRxProfile() throws InterruptedException {

    LoginPage.newUserLogin();
    ProfilePage profilePage = homePage.clickProfilePage();
    profilePage.setCreateRxProfileBtn();
    profilePage.setNameField("Test Profile");
    profilePage.setNewPrescriptionRdoBtn();
    //profilePage.setChooseAvatar();
    profilePage.selectODSph("-1.25");
    profilePage.selectOSSph("-4.75");
    profilePage.selectODCyl("+1.00");
    profilePage.selectOSCyl("+1.50");
    profilePage.selectODAxis("10");
    profilePage.selectOSAxis("65");
    profilePage.selectODAdd("+0.50");
    profilePage.selectOSAdd("+1.00");
    profilePage.selectPD("61");
    profilePage.setDoctorsNameField("Dr. Test");
    profilePage.setDob("06/05/2000");
    profilePage.setPrescribedDate(todaysDate);
    Calendar cal = Calendar.getInstance();
    cal.add(Calendar.YEAR, 1);
    profilePage.setExpirationDate(todaysDate + Keys.ARROW_UP);
    profilePage.setUploadRx(System.getProperty("user.dir") + "\\resources\\videos\\puppy.jpg");
    Thread.sleep(500);
    profilePage.setCreateRxBtn();

}

    public void updateExistingProfile(){

    }
}
