package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JoinTheTeamPage {

    WebDriver driver;

    public JoinTheTeamPage(WebDriver driver){this.driver = driver;}

    private By prefixSelect = By.id("prefix_3");
    private By firstNameField = By.id("first_3");
    private By middleNameField = By.id("middle_3");
    private By lastNameField = By.id("last_3");
    private By suffixField = By.id("suffix_3");
    private By streetAddressField = By.id("input_4_addr_line1");
    private By CityField = By.id("input_4_city");
    private By stateSelect = By.id("input_4_state");
    private By zipCodeField = By.id("input_4_postal");
    private By areaCodeField = By.id("input_5_area");
    private By phoneNumberField = By.id("input_5_phone");
    private By emailField = By.id("input_7");
    private By employedRadioBtn = By.id("input_9_0");
    private By prevApplyRadioBtn = By.id("input_10_0");
    private By positionDesireSelect = By.id("input_11");
    private By hourlyWageField = By.id("input_17");
    private By typingTestLink = By.linkText("here");
    private By typingSpeedField = By.id("input_19");
    private By whenStartMonth = By.id("month_20");
    private By whenStartDay = By.id("day_20");
    private By whenSartYear = By.id("year_20");
    private By transportationRadioBtn = By.id("input_21_0");
    private By locationSelect = By.id("input_22");
    private By hoursWeekSelect = By.id("input_23");
    private By daysHoursWorkField = By.id("input_24");
    private By staffRdoBtn = By.id("input_25_0");
    private By satRdoBtn = By.id("input_26_0");
    private By drugTestRdoBtn = By.id("input_27_0");
    private By crimeRdoBtn = By.id("input_28_0");
    private By whyApplyField = By.id("input_29");
    private By videoUpload = By.id("input_88");
    private By hearAboutSelect = By.id("input_30");


}
