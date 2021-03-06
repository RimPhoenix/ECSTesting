package joinTheTeam;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.JoinTheTeamPage;

import java.awt.*;
import java.awt.event.KeyEvent;
public class JoinTheTeamTests extends BaseTests {


    @Test
    public void testResume() throws InterruptedException {
         JoinTheTeamPage joinTheTeamPage = homePage.clickJoinTheTeam();
         WebDriverWait wait = new WebDriverWait(driver, 2);
         wait.until(ExpectedConditions.presenceOfElementLocated(By.id("92794888408175")));
         driver.switchTo().frame(driver.findElement(By.id("92794888408175")));
         String prefix = "Mrs.";
         joinTheTeamPage.selectPrefixFromDD(prefix);
         joinTheTeamPage.setFirstNameField("Ima");
         joinTheTeamPage.setMiddleNameField("Auto");
         joinTheTeamPage.setLastNameField("Test");
         joinTheTeamPage.setSuffixField("IV");
         joinTheTeamPage.setStreetAddressField("123 Fake Street");
         joinTheTeamPage.setCityField("Anytown");
         String state = "Kansas";
         joinTheTeamPage.selectStateFromDD(state);
         joinTheTeamPage.setZipCodeField("55555");
         joinTheTeamPage.setAreaCodeField("913");
         joinTheTeamPage.setPhoneNumberField("777-7777");
         joinTheTeamPage.setAltAreaCodeField("816");
         joinTheTeamPage.setAltPhoneNumberField("555-5555");
         joinTheTeamPage.setEmailField("auto@test.com");
         joinTheTeamPage.setEmployedRdoBtn();
         //joinTheTeamPage.setPrevApplyRdoBtn();
         String position = "Lab Technician";
         joinTheTeamPage.selectPositionFromDD(position);
         joinTheTeamPage.setHourlyWageField("15");
         //joinTheTeamPage.setTypingTestLink();
         joinTheTeamPage.setTypingSpeedField("45");
         joinTheTeamPage.setTransportationRdoBtn();
         String location = "Topeka, KS";
         joinTheTeamPage.selectLocationFromDD(location);
         String hours = "Flexible";
         joinTheTeamPage.selectHoursWeek(hours);
         joinTheTeamPage.setDaysHoursWorkField("Monday-Saturday 9-5");
         joinTheTeamPage.setStaffRdoBtn();
         joinTheTeamPage.setSatRdoBtn();
         joinTheTeamPage.setDrugTestRdoBtn();
         joinTheTeamPage.setCrimeRdoBtn();
         joinTheTeamPage.setWhyApplyField("Because I like glasses");
         String videoPath = System.getProperty("user.dir") + "\\resources\\videos\\puppyShoes.mp4";
         joinTheTeamPage.setVideoUploadBtn(videoPath);
         joinTheTeamPage.selectHearAboutFromDD("Indeed");
         joinTheTeamPage.setHighSchoolField("HighSchool High");
         joinTheTeamPage.setYearsOfHS("4");
         joinTheTeamPage.setGraduateRdoBtn();
         joinTheTeamPage.setHSGPA("3.1");
         joinTheTeamPage.selectCollegeFromDD("Some college");
         joinTheTeamPage.setGraduationYear("2020");
         joinTheTeamPage.setCollegeGPA("3.0");
         joinTheTeamPage.setServedArmedRdoBtn();
         joinTheTeamPage.selectWhichService("National Guard");
         joinTheTeamPage.setHowLongService("2");
         joinTheTeamPage.setHonorablyDischargedRdoBtn();
         joinTheTeamPage.setWhyNotHonorable("I was removed for saying there are only 2 genders.");
         joinTheTeamPage.setEmployerName("My old Employer Store");
         joinTheTeamPage.setHrPay("$14");
         int todayYear = Integer.parseInt(todaysYear);
         joinTheTeamPage.setStartDateMonth(todaysMonth);
         joinTheTeamPage.setStartDateDay(todaysDay);
         joinTheTeamPage.setStartDateYear(String.valueOf(todayYear-1));
         joinTheTeamPage.setEndDateMonth(todaysMonth);
         joinTheTeamPage.setEndDateDay(todaysDay);
         joinTheTeamPage.setEndDateYear(todaysYear);
         joinTheTeamPage.setEmployerName1("My older Employer Store");
         joinTheTeamPage.setHrPay1("$11");
         joinTheTeamPage.setStartDateMonth1(todaysMonth);
         joinTheTeamPage.setStartDateDay1(todaysDay);
         joinTheTeamPage.setStartDateYear1(String.valueOf(todayYear-2));
         joinTheTeamPage.setEndDateMonth1(todaysMonth);
         joinTheTeamPage.setEndDateDay1(todaysDay);
         joinTheTeamPage.setEndDateYear1(String.valueOf(todayYear-1));
         joinTheTeamPage.setEmployerName2("My oldest Employer Store");
         joinTheTeamPage.setHrPay2("$8");
         joinTheTeamPage.setStartDateMonth2(todaysMonth);
         joinTheTeamPage.setStartDateDay2(todaysDay);
         joinTheTeamPage.setStartDateYear2(String.valueOf(todayYear-4));
         joinTheTeamPage.setEndDateMonth2(todaysMonth);
         joinTheTeamPage.setEndDateDay2(todaysDay);
         joinTheTeamPage.setEndDateYear2(String.valueOf(todayYear-2));
         joinTheTeamPage.setSkillsField("Customer retail");
         joinTheTeamPage.setVolunteerField("Soup kitchen");
         //This section was removed from the join the team page
//         joinTheTeamPage.selectRefPrefix("Dr.");
//         joinTheTeamPage.setRefFirstName("Nice");
//         joinTheTeamPage.setRefLastName("Guy");
//         joinTheTeamPage.setRefSuffix("III");
//         Thread.sleep(100);
//         joinTheTeamPage.setRefRelation("Friend of the family");
//         joinTheTeamPage.setRefPhoneArea("918");
//         joinTheTeamPage.setRefPhoneNumber("777-2020");
//         joinTheTeamPage.setRefEmail("doc@eyeDoctor.com");
//         joinTheTeamPage.setRefYearsKnown("15");
//         joinTheTeamPage.selectRef1Prefix("Ms.");
//         joinTheTeamPage.setRef1FirstName("Goody");
//         joinTheTeamPage.setRef1LastName("Friend");
//         joinTheTeamPage.setRef1Suffix("I");
//         Thread.sleep(100);
//         joinTheTeamPage.setRef1Relation("My best friend from High School");
//         joinTheTeamPage.setRef1PhoneArea("913");
//         joinTheTeamPage.setRef1PhoneNumber("555-1234");
//         joinTheTeamPage.setRef1YearsKnown("6");
         joinTheTeamPage.setSignature("Ima Auto Test");
         joinTheTeamPage.setAttachResumeBtn(System.getProperty("user.dir") + "\\resources\\videos\\puppy.jpg");
         Thread.sleep(1000);
         joinTheTeamPage.setSubmitApplicationBtn();

    }
}
