package base;

import com.google.common.io.Files;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LoginPage;
import utils.WindowManager;
import javax.swing.text.DateFormatter;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;



public class BaseTests {

    public EventFiringWebDriver driver;
    public WebDriverWait wait;
    protected HomePage homePage;
    protected LoginPage loginPage;
    public static String os = System.getProperty("os.name").toLowerCase();
    public static boolean isWindows(){
        return os.contains("win");
    }
    public static boolean isMac(){
        return os.contains("mac");
    }
    public static boolean isUnix(){
        return os.contains("nix") || os.contains("nux") || os.contains("aix");
    }
    private By advacedBtn = By.id("details-button");
    private By proceedLink = By.id("proceed-link");



    public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new ExpectedCondition<Boolean>() {
            @NullableDecl
            @Override
            public Boolean apply(@NullableDecl WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(pageLoadCondition);
    }

    //Create object of SimpleDateFormat class and decide the format (can also include time ->  "HH:mm:ss")
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
    //get current date with Date()
    Date date = new Date();
    //Make the date a string to type out.
    public String todaysDate = dateFormat.format(date);

    //Date and Time format
    DateFormat dateAndTimeFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    Date dateAndTime = new Date();
    public String todaysDateAndTime = dateAndTimeFormat.format(dateAndTime);

    //Date and Time used for Login purposes
    DateFormat dateAndTimeForLoginFormat = new SimpleDateFormat("YYMMddHHmmss");
    Date dateAndTimeForLogin = new Date();
    public String loginDateAndTime = dateAndTimeForLoginFormat.format(dateAndTimeForLogin);

    //Date and Time for Tracking Number purposes
    DateFormat dateAndTimeForTrackingNumberFormat = new SimpleDateFormat("YYHHmmss");
    Date dateAndTimeForTrackingNumber = new Date();
    public String trackingNumberDandT = dateAndTimeForTrackingNumberFormat.format(dateAndTimeForTrackingNumber);

    //Date get the Month
    DateFormat dateMonthFormat = new SimpleDateFormat("MM");
    Date dateMonth = new Date();
    public String todaysMonth = dateMonthFormat.format(dateMonth);

    //Date get the Day
    DateFormat dateDayFormat = new SimpleDateFormat("dd");
    Date dateDay = new Date();
    public String todaysDay = dateDayFormat.format(dateDay);

    //Date get the Year
    DateFormat dateYearFormat = new SimpleDateFormat("YYYY");
    Date dateYear = new Date();
    public String todaysYear = dateYearFormat.format(dateYear);



    @BeforeClass


    public void setUp() {
        if (isWindows()) {
            System.setProperty("webdriver.chrome.driver", "resources/Windows/chromedriver.exe");
//            ChromeDriverService service = new ChromeDriverService.Builder()
//                    .usingDriverExecutable(new File("resources/Windows/chromedriver"))
//                    .usingAnyFreePort()
//                    .build();
            driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
           // driver.get("https://www.successvision.shop/");
            driver.get("http://successvision.help/");
            loginPage = new LoginPage(driver);
//            driver.findElement(advacedBtn).click();
//            driver.findElement(proceedLink).click();

        } else if (isMac()){
            System.setProperty("webdriver.chrome.driver", "resources/Mac/chromedriver");
//            ChromeDriverService service = new ChromeDriverService.Builder()
//                    .usingDriverExecutable(new File("resources/Mac/chromedriver"))
//                    .usingAnyFreePort()
//                    .build();
            driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
            //driver.get("https://www.successvision.shop/");
            driver.get("http://successvision.help/");
        } else if (isUnix()){
            System.setProperty("webdriver.chrome.driver", "resources/Linux/chromedriver");
//            ChromeDriverService service = new ChromeDriverService.Builder()
//                    .usingDriverExecutable(new File("resources/Linux/chromedriver"))
//                    .usingAnyFreePort()
//                    .build();
            driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
          //  driver.get("https://www.successvision.shop/");
            driver.get("http://successvision.help/");

        } else {
            System.out.println("Your OS is not supported");
        }
        //driver.manage().window().maximize();

        //****Before any test can be run, make sure you Login with the account you want from the LoginPage
        //****In the Method TYPE LoginPage.(choose login level)
    }


    @BeforeMethod
    public void goToLogin() {
       // var baseUrl = "https://www.successvision.shop/";
        var baseUrl = "http://successvision.help/";
        driver.get(baseUrl);
        waitForLoad(driver);
        homePage = new HomePage(driver);
    }

    @BeforeTest
    public void checkIfDriverIsNull() {
        
    }


    @AfterMethod

    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot, new File("resources/screenshots/" + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // ****** If you want a ScreenShot after every method (pass or fail) use this code.
    //    public void takeScreenshot(){
//        var camera = (TakesScreenshot)driver;
//        File screenshot = camera.getScreenshotAs(OutputType.FILE);
//        //System.out.println("Screenshot taken: " + screenshot.getAbsolutePath());
//        try{
//            Files.move(screenshot, new File("resources/screenshots/test.png"));
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//    }
    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-infobars");
        //options.setHeadless(true);  ***//Runs Test without opening browser
        return options;
    }

//      @AfterClass
//      public void tearDown(){
//         driver.quit();
//      }


}
