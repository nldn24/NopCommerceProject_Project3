package US_503_PositiveAndNegativeLoginCombinations;

import Pages.HomePage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.BaseGUITest;
import utility.ConfigReader;

public class US_503_PositiveAndNegativeLoginCombinations extends BaseGUITest {

    @DataProvider
    public static Object[][] invalidLoginCredentials() {
        return new Object[][]{};
    }

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

    @Test(priority = 3, description = "The customer enters an incorrect email address three times in the email field.",
    dataProvider = "invalidLoginCredentials",dataProviderClass = TestDataProvider.class)
    @Description("The customer enters an incorrect email address three times in the email field.")
    @Severity(SeverityLevel.CRITICAL)
    public void invalidLogin(String email, String password){
        driver.get(ConfigReader.getProperty("baseURL"));
        homePage.clickLoginButton();
        BaseDriver.threadWait(2);
        loginPage.fillLoginMask(email,password);
        BaseDriver.threadWait(3);

        if (!email.equals(ConfigReader.getProperty("email")) || !password.equals(ConfigReader.getProperty("password"))) {
            LOGGER.warn("❌ Invalid login -> Email: " + email + " | Password: " + password);
        } else {
            LOGGER.info("✅ Valid login -> Email: " + email + " | Password: " + password);
        }

    }
}
