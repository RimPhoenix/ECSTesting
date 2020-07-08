package buyingProduct;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BuyingProductPage;
import static org.testng.Assert.assertEquals;

import java.util.Calendar;

public class BuyingProductTests extends BaseTests {

   // private WebDriver driver;

    @Test

    public void buySomeGlasses() throws InterruptedException {

        BuyingProductPage buyingProductPage = homePage.clickBuyingProducts();
        buyingProductPage.setChooseGlasses();
        buyingProductPage.setAddToCart();
        Thread.sleep(200);
        buyingProductPage.selectODSph("-1.25");
        buyingProductPage.selectOSSph("-4.75");
        buyingProductPage.selectODCyl("+1.00");
        buyingProductPage.selectOSCyl("+1.50");
        buyingProductPage.selectODAxis("10");
        buyingProductPage.selectOSAxis("65");
        buyingProductPage.selectODAdd("+0.50");
        buyingProductPage.selectOSAdd("+1.00");
        buyingProductPage.selectPD("61");
        buyingProductPage.setDoctorsNameField("Dr. Test");
        buyingProductPage.setDob("06/05/2000");
        buyingProductPage.setPrescribedDate(todaysDate);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, 1);
        buyingProductPage.setExpirationDate(todaysDate + Keys.ARROW_UP);
        buyingProductPage.setUploadRx(System.getProperty("user.dir") + "\\resources\\videos\\puppy.jpg");
        Thread.sleep(800);
        buyingProductPage.setAddRxBtn();
        Thread.sleep(300);
        buyingProductPage.setChooseGlassesType();
        Thread.sleep(200);
        buyingProductPage.setChooseLensesRdoBtn();
        buyingProductPage.setContinueBtn();
        buyingProductPage.setFirstNameField("Ima");
        buyingProductPage.setLastNameField("Test");
        buyingProductPage.setAddressField("123 Fake Street");
        buyingProductPage.setCityField("Anytown");
        buyingProductPage.setStateField("Kansas");
        buyingProductPage.setZipCodeField("66225");
        buyingProductPage.setEmailField("ECSTest@mailinator.com");
        buyingProductPage.setPhoneField("913-555-5555");
        buyingProductPage.setShippingRdoBtn();
        buyingProductPage.setReviewOdrBtn();
        System.out.println("driver= " + driver);
        Thread.sleep(200);
        buyingProductPage.setClickAddNoteField();
        buyingProductPage.setAddNote("Here is the test note I wrote.");
        buyingProductPage.setRefundCheckBox();
        Thread.sleep(250);
        buyingProductPage.setCreditCardNbr("4111111111111111");
        buyingProductPage.setCardExpDate("0825");
        buyingProductPage.setCardCvvNbr("456");
        buyingProductPage.setCardZip("66225");
        Thread.sleep(2000);
        buyingProductPage.setCompleteOdrBtn();
        buyingProductPage.setContShoppingBtn();
    }


}
