package US_501_UserRegistration;

import Pages.HomePage;
import Pages.RegisterPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.BaseGUITest;

public class US501 extends BaseGUITest {
    HomePage homePage;
    RegisterPage registerPage;

    private static final Logger LOGGER = LogManager.getLogger(US501.class);

    @BeforeClass(alwaysRun = true)
    public void  setupPages(){
        homePage = new HomePage(driver);
        registerPage=new RegisterPage(driver);
    }
    @Test(priority = 1, groups = {"Smoke","Registration"}, description = "Verify that home page is visible successfully")
    @Description("Verify that home page is visible successfully")
    @Severity(SeverityLevel.CRITICAL)
    public  void verifyHomePage(){
        homePage.verifyHomePage();
        LOGGER.info("Home page opened");
    }
    @Test(priority = 2, groups = {"Smoke","Registration"}, description = "Register button clicked successfully")
    @Description("Register button clicked successfully")
    @Severity(SeverityLevel.CRITICAL)
    public  void clickRegisterButton(){
        homePage.clickRegisterButton();
        LOGGER.info("Register button clicked");
    }
    @Test(priority = 3, groups = {"Smoke","Registration"}, description = "Register page verified successfully.")
    @Description("Register page verified successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void verifyRegisterPage(){
        registerPage.verifyRegisterPage();
        LOGGER.info("Register page verified.");
    }
    @Test(priority = 4, groups = {"Smoke","Registration"}, description = "Gender ‘Female’ selected successfully.")
    @Description("Gender ‘Female’ selected successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void clickGender(){
        registerPage.selectFemaleGender();
        LOGGER.info("Gender ‘Female’ selected.");
    }
    @Test(priority = 5, groups = {"Smoke","Registration"}, description = "First name entered successfully.")
    @Description("First name entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void fillFirstName(){
        registerPage.fillFirstName();
        LOGGER.info("First name entered.");
    }
    @Test(priority = 6, groups = {"Smoke","Registration"}, description = "Last name entered successfully.")
    @Description("Last name entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void fillLastName(){
        registerPage.fillLastName();
        LOGGER.info("Last name entered.");
    }
    @Test(priority = 7, groups = {"Smoke","Registration"}, description = "Email entered successfully.")
    @Description("Email entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void fillEmail(){
        registerPage.fillEmail();
        LOGGER.info("Email entered.");
    }
    @Test(priority = 8, groups = {"Smoke","Registration"}, description = "Password entered successfully.")
    @Description("Password entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void fillPassword(){
        registerPage.fillPassword();
        LOGGER.info("Password entered.");
    }
    @Test(priority = 9, groups = {"Smoke","Registration"}, description = "Confirm Password entered successfully.")
    @Description("Confirm Password entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void fillConfirmPassword(){
        registerPage.fillConfirmPassword();
        LOGGER.info("Confirm Password entered.");
    }
    @Test(priority = 10, groups = {"Smoke","Registration"}, description = "Register button clicked successfully.")
    @Description("Register button clicked successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void clickRegisterBtn() {
        registerPage.clickRegisterButton();
        LOGGER.info("Register button clicked.");
    }
    @Test(priority = 11, groups = {"Smoke","Registration"}, description = "Registration completed message verified successfully.")
    @Description("Registration completed message verified successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void verifyCompletedRegister(){
        registerPage.verifyRegisterCompleted();
        LOGGER.info("Registration completed message verified.");
    }
}

