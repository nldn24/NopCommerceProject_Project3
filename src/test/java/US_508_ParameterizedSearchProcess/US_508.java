package US_508_ParameterizedSearchProcess;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.BaseGUITest;
import utility.ConfigReader;

public class US_508 extends BaseGUITest {

    @Test(priority = 1, groups = {"Smoke","Registration"}, description = "Verify that home page is visible successfully")
    @Description("Verify that home page is visible successfully")
    @Severity(SeverityLevel.CRITICAL)
    public  void verifyHomePage(){
        homePage.verifyHomePage();
        LOGGER.info("Home page opened");
    }
    @Test(priority = 2,groups = {"Smoke","Login Test"}, description = "Login button clicked successfully.")
    @Description("Login button clicked successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickLoginBtn(){
        homePage.clickLoginButton();
        LOGGER.info("Login button clicked.");
        BaseDriver.threadWait(3);
    }
    @Test(priority = 3,groups = {"Smoke","Login Test"}, description = "Email entered successfully.")
    @Description("Email entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void emailInput(){
        loginPage.emailInput(ConfigReader.getProperty("email"));
        LOGGER.info("Email entered.");
        BaseDriver.threadWait(3);

    }
    @Test(priority = 4,groups = {"Smoke","Login Test"}, description = "Password entered successfully.")
    @Description("Password entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void passwordInput(){
        loginPage.passwordInput(ConfigReader.getProperty("password"));
        LOGGER.info("Password entered.");
        BaseDriver.threadWait(3);
    }
    @Test(priority = 5,groups = {"Smoke","Login Test"}, description = "Login button clicked successfully.")
    @Description("Login button clicked successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickLoginButton(){
        loginPage.clickLoginBtn();
        LOGGER.info("Login button clicked.");
    }
    @Test(priority = 6,groups = {"Smoke","UITesting","Search","Regression"}, description = "Search box clicked successfully.")
    @Description("Search box clicked successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickSearchBox(){
        productSearchPage.clickSearchBox();
        LOGGER.info("Search box clicked.");
        BaseDriver.threadWait(3);
    }
    @Test(priority = 7, groups = {"Smoke","UITesting","Search","Regression"}, description = "Product name entered successfully.")
    @Description("Product name entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void fillSearchBox(){
        productSearchPage.fillSearchBox();
        LOGGER.info("Product name entered.");
        BaseDriver.threadWait(2);
    }
    @Test(priority = 8,groups = {"Smoke","UITesting","Search","Regression"}, description = "Search button clicked successfully.")
    @Description("Search button clicked successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickSearchButton(){
        productSearchPage.clickSearchBtn();
        LOGGER.info("Search button clicked.");
        BaseDriver.threadWait(3);
    }
    @Test(priority = 9, groups = {"Smoke","UITesting","Search","Regression"}, description = "Verify that product name is visible successfully")
    @Description("Verify that product name is visible successfully")
    @Severity(SeverityLevel.CRITICAL)
    public  void verifyProductName(){
        productSearchPage.verifyProductTitle();
        LOGGER.info("Product name visible");
    }
    @Attachment(value = "Adim sayisi", type = "text/plain")
    public String step(String message) {
        return message;
    }

}
