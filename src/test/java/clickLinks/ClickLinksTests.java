package clickLinks;

import base.BaseTests;
import org.testng.annotations.Test;

public class ClickLinksTests extends BaseTests {


   // String baseUrl = "https://www.successvision.shop/";
    String baseUrl = "http://successvision.help/";


    //  public ClickLinksTests(WebDriver driver) { this.driver = driver }


    private void checkUrl(String path) {
        driver.get(baseUrl + path);
        System.out.println(driver.getTitle() + "  -->  " + path);
    }

    @Test
    public void testURLs() {
        //used in the AccessLevelTests, If you want to run this by it's self add a LoginPage.(any login level you desire) before the checkUrl
        //loginPage.storeIPadLogin();
        checkUrl("products");
        checkUrl("specials");
        checkUrl("contact-us");
        checkUrl("about-us");
        checkUrl("locations");
        checkUrl("join-the-team");
        checkUrl("checkout");
        checkUrl("shipping-and-return-policy");
        checkUrl("privacy-policy");
        checkUrl("frequently-asked-questions");
        checkUrl("feedback");

    }
    @Test
    public void userTest() {

    }

    @Test
    public void testProducts(){
        checkUrl("products/12943");
        checkUrl("products/15903");
        checkUrl("products/14762");
        checkUrl("products/16638");
        checkUrl("products/15895");
        checkUrl("products/12940");
        checkUrl("products/19006");
        checkUrl("products/19101");
        checkUrl("products/13643");
        checkUrl("products/17848");
        checkUrl("products/19120");
        checkUrl("products/19130");
        checkUrl("products/");

    }

}
