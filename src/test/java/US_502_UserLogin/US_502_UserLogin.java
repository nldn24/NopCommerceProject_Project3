package US_502_UserLogin;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.BaseGUITest;
import utility.ConfigReader;

public class US_502_UserLogin extends BaseGUITest {



    @Test(priority = 1, description = "Open the browser and navigate to the Website. ")
    @Description("Navigate to Website.")
    @Severity(SeverityLevel.CRITICAL)
    public void navigateToWebsite(){
        homePage.verifyhomePage();
    }

    @Test(priority = 2, description = "The customer clicks the login button.")
    @Description("Click login button")
    @Severity(SeverityLevel.CRITICAL)
    public void clickLoginBtn(){
        homePage.clickLoginButton();
        BaseDriver.threadWait(3);
    }


    @Test(priority = 3, description = "The customer enters their email address in the email section.")
    @Description("The customer enters their email address in the email section.")
    @Severity(SeverityLevel.CRITICAL)
    public void emailInput(){
        loginPage.emailInput(ConfigReader.getProperty("email"));
        LOGGER.info("The customer was able to enter their email address in the email section.");
        BaseDriver.threadWait(5);

    }

    @Test(priority = 4, description = "The customer enters their password in the password field.")
    @Description("The customer enters their password in the password field.")
    @Severity(SeverityLevel.CRITICAL)
    public void passwordInput(){
        loginPage.passwordInput(ConfigReader.getProperty("password"));
        LOGGER.info("The customer entered their password in the password field.");
        BaseDriver.threadWait(3);
    }

    @Test(priority = 5, description = "The customer clicks the login button.")
    @Description("The customer clicks the login button.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickLoginButton(){
        loginPage.clickLoginBtn();
    }

}
