package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By registerLink = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/a[1]");
    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click(); }

//    public ProductsPage clickProducts() {
//        clickLink("Products");
//        return new ProductsPage(driver);
//    }
    public SpecialsPage clickSpecials(){
        clickLink("Specials");
        return new SpecialsPage(driver);
    }

    public ContactUsPage clickContactUs(){
        clickLink("Contact Us");
        return new ContactUsPage(driver);
    }

    public PrivacyPolicyPage clickPrivacyPolicy(){
        clickLink("Privacy Policy");
        return new PrivacyPolicyPage(driver);
    }

    public FAQsPage clickFAQs(){
        clickLink("FAQ's");
        return new FAQsPage(driver);
    }

    public YourFeedbackPage clickYourFeedback(){
        clickLink("Your Feedback");
        return new YourFeedbackPage(driver);
    }

    public LocationsPage clickLocations(){
        clickLink("Locations");
        return new LocationsPage(driver);
    }

    public ShippingAndReturnsPage clickShippingAndReturns(){
        clickLink("Shipping & Returns");
        return new ShippingAndReturnsPage(driver);
    }

    public AboutUsPage clickAboutUs(){
        clickLink("About Us");
        return new AboutUsPage(driver);
    }

    public JoinTheTeamPage clickJoinTheTeam(){
        clickLink("Join the Team");
        return new JoinTheTeamPage(driver);
    }

    public ProductsPage clickProducts(){
        driver.findElement(By.xpath("//div[@id='vue-header']//header//div//div//div//a[contains(text(),'Women')]")).click();
        return new ProductsPage(driver);
    }

    public RegisterUserPage clickRegisterUser(){
        driver.get("https://www.successvision.help/register");
        return new RegisterUserPage(driver);
    }

    public ProfilePage clickProfilePage(){
        driver.get("https://successvision.help/profiles");
        return new ProfilePage(driver);
    }

    public BuyingProductPage clickBuyingProducts(){
        driver.get("https://www.successvision.help/products");
        return new BuyingProductPage(driver);
    }

}
