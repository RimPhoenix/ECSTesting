package specials;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SpecialsPage;

public class SpecialsTests extends BaseTests {

    @Test

    public void checkTheSpeicals(){

        SpecialsPage specialsPage = homePage.clickSpecials();
        specialsPage.setSpecialCode1();
        getWindowManager().goBack();
        specialsPage.setSpecialCode2();
        getWindowManager().goBack();
        specialsPage.setSpecialCode3();
        getWindowManager().goBack();
        specialsPage.setSpecialCode4();
        getWindowManager().goBack();
        specialsPage.setSpecialCode5();
        getWindowManager().goBack();

    }
}
