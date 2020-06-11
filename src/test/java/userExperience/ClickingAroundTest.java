package userExperience;

import base.BaseTests;
import org.testng.annotations.Test;

import pages.SpecialsPage;

public class ClickingAroundTest extends BaseTests {


    @Test
    public void clickingLinks(){

        SpecialsPage specialsPage = homePage.clickSpecials();


    }
}
