package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JoinTheTeamPage {

    WebDriver driver;

    public JoinTheTeamPage(WebDriver driver){this.driver = driver;}

    private By prefixDD = By.id("prefix_3");
    private Select findPrefix() {return new Select(driver.findElement(prefixDD));}
    private By firstNameField = By.id("first_3");
    private By middleNameField = By.id("middle_3");
    private By lastNameField = By.id("last_3");
    private By suffixField = By.id("suffix_3");
    private By streetAddressField = By.id("input_4_addr_line1");
    private By cityField = By.id("input_4_city");
    private By stateDD = By.id("input_4_state");
    private Select findState(){return new Select(driver.findElement(stateDD));}
    private By zipCodeField = By.id("input_4_postal");
    private By areaCodeField = By.id("input_5_area");
    private By phoneNumberField = By.id("input_5_phone");
    private By altAreaCodeField = By.id("input_6_area");
    private By altPhoneNumberField = By.id("input_6_phone");
    private By emailField = By.id("input_7");
    private By employedRdoBtn = By.id("input_9_0");
    private By prevApplyRdoBtn = By.id("input_10_0");
    private By positionDesireDD = By.id("input_11");
    private Select findPosition(){return new Select(driver.findElement(positionDesireDD));}
    private By hourlyWageField = By.id("input_17");
    private By typingTestLink = By.linkText("here");
    private By typingSpeedField = By.id("input_19");
    private By whenStartMonth = By.id("month_20");
    private By whenStartDay = By.id("day_20");
    private By whenStartYear = By.id("year_20");
    private By transportationRdoBtn = By.id("input_21_0");
    private By locationDD = By.id("input_22");
    private Select findLocation(){return new Select(driver.findElement(locationDD));}
    private By hoursWeekDD = By.id("input_23");
    private Select findHoursWeek(){return new Select(driver.findElement(hoursWeekDD));}
    private By daysHoursWorkField = By.id("input_24");
    private By staffRdoBtn = By.id("input_25_0");
    private By satRdoBtn = By.id("input_26_0");
    private By drugTestRdoBtn = By.id("input_27_0");
    private By crimeRdoBtn = By.id("input_28_1");
    private By whyApplyField = By.id("input_29");
    private By videoUploadBtn = By.id("input_88");
    private By hearAboutDD = By.id("input_30");
    private Select findHearAbout(){return new Select(driver.findElement(hearAboutDD));}
    private By highSchoolField = By.id("input_33");
    private By yearsOfHS = By.id("input_34");
    private By graduateRdoBtn = By.id("input_35_0");
    private By HSGPA = By.id("input_36");
    private By collegeDD = By.id("input_37");
    private Select findCollege(){return new Select(driver.findElement(collegeDD));}
    private By graduationYear = By.id("input_38");
    private By collegeGPA = By.id("input_39");
    private By servedArmedRdoBtn = By.id("input_41_0");
    private By whichServiceDD = By.id("input_42");
    private Select findWhichService(){return new Select(driver.findElement(whichServiceDD));}
    private By howLongService = By.id("input_43");
    private By honorablyDischargedRdoBtn = By.id("input_44_1");
    private By whyNotHonorable = By.id("input_45");
    private By employerName = By.id("input_47");
    private By hrPay = By.id("input_48");
    private By startDateMonth = By.id("month_49");
    private By startDateDay = By.id("day_49");
    private By startDateYear = By.id("year_49");
    private By endDateMonth = By.id("month_50");
    private By endDateDay = By.id("day_50");
    private By endDateYear = By.id("year_50");
    private By employerName1 = By.id("input_52");
    private By hrPay1 = By.id("input_53");
    private By startDateMonth1 = By.id("month_54");
    private By startDateDay1 = By.id("day_54");
    private By startDateYear1 = By.id("year_54");
    private By endDateMonth1 = By.id("month_55");
    private By endDateDay1 = By.id("day_55");
    private By endDateYear1 = By.id("year_55");
    private By employerName2 = By.id("input_57");
    private By hrPay2 = By.id("input_58");
    private By startDateMonth2 = By.id("month_59");
    private By startDateDay2 = By.id("day_59");
    private By startDateYear2 = By.id("year_59");
    private By endDateMonth2 = By.id("month_60");
    private By endDateDay2 = By.id("day_60");
    private By endDateYear2 = By.id("year_60");
    private By skillsField = By.id("input_62");
    private By volunteerField = By.id("input_63");
    private By refPrefixDD = By.id("prefix_67");
    private Select findRefPrefix() {return new Select(driver.findElement(refPrefixDD));}
    private By refFirstName = By.id("first_67");
    private By refLastName = By.id("last_67");
    private By refSuffix = By.id("suffix_67");
    private By refRelation = By.id("input_68");
    private By refPhoneArea = By.id("input_69_area");
    private By refPhoneNumber = By.id("input_69_phone");
    private By refEmail = By.id("input_70");
    private By refYearsKnown = By.id("input_71");
    private By ref1PrefixDD = By.id("prefix_74");
    private Select findRef1Prefix() {return new Select(driver.findElement(ref1PrefixDD));}
    private By ref1FirstName = By.id("first_74");
    private By ref1LastName = By.id("last_74");
    private By ref1Suffix = By.id("suffix_74");
    private By ref1Relation = By.id("input_75");
    private By ref1PhoneArea = By.id("input_76_area");
    private By ref1PhoneNumber = By.id("input_76_phone");
    //private By ref1Email = By.id("input_77");
    private By ref1YearsKnown = By.id("input_77");
    private By todayDateMonth = By.id("month_80");
    private By todayDateDay = By.id("day_80");
    private By todayDateYear = By.id("year_80");
    private By signature = By.id("input_81");
    private By attachResumeBtn = By.id("input_83");
    private By submitApplicationBtn = By.id("input_85");
    private By clearFormBtn = By.id("input_reset_85");
    private By printFormBtn = By.id("input_print_85");


    public void selectPrefixFromDD(String prefix){
        WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.presenceOfElementLocated(prefixDD));
        findPrefix().selectByVisibleText(prefix);
    }

    public void setFirstNameField(String firstName){driver.findElement(firstNameField).sendKeys(firstName);}

    public void setMiddleNameField(String middleName){driver.findElement(middleNameField).sendKeys(middleName);}

    public void setLastNameField(String lastName){driver.findElement(lastNameField).sendKeys(lastName);}

    public void setSuffixField(String suffix){driver.findElement(suffixField).sendKeys(suffix);}

    public void setStreetAddressField(String streetAddress){driver.findElement(streetAddressField).sendKeys(streetAddress);}

    public void setCityField(String city){driver.findElement(cityField).sendKeys(city);}

    public void selectStateFromDD(String state){findState().selectByVisibleText(state);}

    public void setZipCodeField(String zipCode){driver.findElement(zipCodeField).sendKeys(zipCode);}

    public void setAreaCodeField(String areaCode){driver.findElement(areaCodeField).sendKeys(areaCode);}

    public void setPhoneNumberField(String phoneNumber){driver.findElement(phoneNumberField).sendKeys(phoneNumber);}

    public void setAltAreaCodeField(String altAreaCode){driver.findElement(altAreaCodeField).sendKeys(altAreaCode);}

    public void setAltPhoneNumberField(String altPhoneNumber){driver.findElement(altPhoneNumberField).sendKeys(altPhoneNumber);}

    public void setEmailField(String email){driver.findElement(emailField).sendKeys(email);}

    public void setEmployedRdoBtn(){driver.findElement(employedRdoBtn).click();}

    public void setPrevApplyRdoBtn(){driver.findElement(prevApplyRdoBtn).click();}

    public void selectPositionFromDD(String position){findPosition().selectByVisibleText(position);}

    public void setHourlyWageField(String wage){driver.findElement(hourlyWageField).sendKeys(wage);}

    public void setTypingTestLink(){driver.findElement(typingTestLink).click();}

    public void setTypingSpeedField(String wpm){driver.findElement(typingSpeedField).sendKeys(wpm);}

    public void setTransportationRdoBtn(){driver.findElement(transportationRdoBtn).click();}

    public void selectLocationFromDD(String location){findLocation().selectByVisibleText(location);}

    public void selectHoursWeek(String hours){findHoursWeek().selectByVisibleText(hours);}

    public void setDaysHoursWorkField(String daysWork){driver.findElement(daysHoursWorkField).sendKeys(daysWork);}

    public void setStaffRdoBtn(){driver.findElement(staffRdoBtn).click();}

    public void setSatRdoBtn(){driver.findElement(satRdoBtn).click();}

    public void setDrugTestRdoBtn(){driver.findElement(drugTestRdoBtn).click();}

    public void setCrimeRdoBtn(){driver.findElement(crimeRdoBtn).click();}

    public void setWhyApplyField(String whyApply){driver.findElement(whyApplyField).sendKeys(whyApply);}

    public void setVideoUploadBtn(String videoPath){driver.findElement(videoUploadBtn).sendKeys(videoPath);}

    public void selectHearAboutFromDD(String hearAbout){findHearAbout().selectByVisibleText(hearAbout);}

    public void setHighSchoolField(String highSchool){driver.findElement(highSchoolField).sendKeys(highSchool);}

    public void setYearsOfHS(String years){driver.findElement(yearsOfHS).sendKeys(years);}

    public void setGraduateRdoBtn(){driver.findElement(graduateRdoBtn).click();}

    public void setHSGPA(String hsGpa){driver.findElement(HSGPA).sendKeys(hsGpa);}

    public void selectCollegeFromDD(String college){findCollege().selectByVisibleText(college);}

    public void setGraduationYear(String gradYear){driver.findElement(graduationYear).sendKeys(gradYear);}

    public void setCollegeGPA(String collegeGpa){driver.findElement(collegeGPA).sendKeys(collegeGpa);}

    public void setServedArmedRdoBtn(){driver.findElement(servedArmedRdoBtn).click();}

    public void selectWhichService(String which){findWhichService().selectByVisibleText(which);}

    public void setHowLongService(String years){driver.findElement(howLongService).sendKeys(years);}

    public void setHonorablyDischargedRdoBtn(){driver.findElement(honorablyDischargedRdoBtn).click();}

    public void setWhyNotHonorable(String reasonWhy){driver.findElement(whyNotHonorable).sendKeys(reasonWhy);}

    public void setEmployerName(String employer){driver.findElement(employerName).sendKeys(employer);}

    public void setHrPay(String pay){driver.findElement(hrPay).sendKeys(pay);}

    public void setStartDateMonth(String startMonth){driver.findElement(startDateMonth).sendKeys(startMonth);}

    public void setStartDateDay(String startDay){driver.findElement(startDateDay).sendKeys(startDay);}

    public void setStartDateYear(String startYear){driver.findElement(startDateYear).sendKeys(startYear);}

    public void setEndDateMonth(String endMonth){driver.findElement(endDateMonth).sendKeys(endMonth);}

    public void setEndDateDay(String endDay){driver.findElement(endDateDay).sendKeys(endDay);}

    public void setEndDateYear(String endYear){driver.findElement(endDateYear).sendKeys(endYear);}

    public void setEmployerName1(String employer){driver.findElement(employerName1).sendKeys(employer);}

    public void setHrPay1(String pay1){driver.findElement(hrPay1).sendKeys(pay1);}
    
    public void setStartDateMonth1(String startMonth1){driver.findElement(startDateMonth1).sendKeys(startMonth1);}
    
    public void setStartDateDay1(String startDay1){driver.findElement(startDateDay1).sendKeys(startDay1);}
    
    public void setStartDateYear1(String startYear1){driver.findElement(startDateYear1).sendKeys(startYear1);}

    public void setEndDateMonth1(String endMonth){driver.findElement(endDateMonth1).sendKeys(endMonth);}

    public void setEndDateDay1(String endDay){driver.findElement(endDateDay1).sendKeys(endDay);}

    public void setEndDateYear1(String endYear){driver.findElement(endDateYear1).sendKeys(endYear);}

    public void setEmployerName2(String employer){driver.findElement(employerName2).sendKeys(employer);}
    
    public void setHrPay2(String pay1){driver.findElement(hrPay2).sendKeys(pay1);}

    public void setStartDateMonth2(String startMonth2){driver.findElement(startDateMonth2).sendKeys(startMonth2);}

    public void setStartDateDay2(String startDay2){driver.findElement(startDateDay2).sendKeys(startDay2);}

    public void setStartDateYear2(String startYear2){driver.findElement(startDateYear2).sendKeys(startYear2);}

    public void setEndDateMonth2(String endMonth){driver.findElement(endDateMonth2).sendKeys(endMonth);}

    public void setEndDateDay2(String endDay){driver.findElement(endDateDay2).sendKeys(endDay);}

    public void setEndDateYear2(String endYear){driver.findElement(endDateYear2).sendKeys(endYear);}

    public void setSkillsField(String skills){driver.findElement(skillsField).sendKeys(skills);}

    public void setVolunteerField(String volunteer){driver.findElement(volunteerField).sendKeys(volunteer);}

    public void selectRefPrefix(String refPrefix){findRefPrefix().selectByVisibleText(refPrefix);}

    public void setRefFirstName(String refFName){driver.findElement(refFirstName).sendKeys(refFName);}

    public void setRefLastName(String refLName){driver.findElement(refLastName).sendKeys(refLName);}

    public void setRefSuffix(String refSuf){driver.findElement(refSuffix).sendKeys(refSuf);}

    public void setRefRelation(String refRel){WebDriverWait wait = new WebDriverWait(driver, 1);
    wait.until(ExpectedConditions.presenceOfElementLocated(refRelation));
        driver.findElement(refRelation).sendKeys(refRel);}

    public void setRefPhoneArea(String refArea){driver.findElement(refPhoneArea).sendKeys(refArea);}

    public void setRefPhoneNumber(String refPhone){driver.findElement(refPhoneNumber).sendKeys(refPhone);}

    public void setRefEmail(String refMail){driver.findElement(refEmail).sendKeys(refMail);}

    public void setRefYearsKnown(String yearsKnown){driver.findElement(refYearsKnown).sendKeys(yearsKnown);}

    public void selectRef1Prefix(String ref1Prefix){findRef1Prefix().selectByVisibleText(ref1Prefix);}

    public void setRef1FirstName(String ref1FName){driver.findElement(ref1FirstName).sendKeys(ref1FName);}

    public void setRef1LastName(String ref1LName){driver.findElement(ref1LastName).sendKeys(ref1LName);}

    public void setRef1Suffix(String ref1Suf){driver.findElement(ref1Suffix).sendKeys(ref1Suf);}

    public void setRef1Relation(String ref1Rel){WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.presenceOfElementLocated(ref1Relation));
        driver.findElement(ref1Relation).sendKeys(ref1Rel);}

    public void setRef1PhoneArea(String ref1Area){driver.findElement(ref1PhoneArea).sendKeys(ref1Area);}

    public void setRef1PhoneNumber(String ref1Phone){driver.findElement(ref1PhoneNumber).sendKeys(ref1Phone);}

    //public void setRef1Email(String ref1Mail){driver.findElement(ref1Email).sendKeys(ref1Mail);}

    public void setRef1YearsKnown(String yearsKnown1){driver.findElement(ref1YearsKnown).sendKeys(yearsKnown1);}

    public void setSignature(String sign){driver.findElement(signature).sendKeys(sign);}

    public void setAttachResumeBtn(String pathToResume){driver.findElement(attachResumeBtn).sendKeys(pathToResume);}

    public void setSubmitApplicationBtn(){driver.findElement(submitApplicationBtn).click();}
}
