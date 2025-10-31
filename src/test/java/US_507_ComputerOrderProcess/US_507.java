package US_507_ComputerOrderProcess;

import Pages.DashboardPage;
import Pages.Desktopspage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.BaseGUITest;
import utility.ConfigReader;

public class US_507 extends BaseGUITest {

    @Test(priority = 1, description = "Open the browser and navigate to the Website. ")
    @Description("Navigate to Website.")
    @Severity(SeverityLevel.CRITICAL)
    public void navigateToWebsite(){
        homePage.verifyHomePage();
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

    @Test(priority = 6, description = "Entry approved.")
    @Description("Entry approved.")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyLogin(){
        dashboardPage.verifyMyAccount();
        BaseDriver.threadWait(3);
    }

    @Test(priority = 7, description = "The customer moved the mouse over the Computer button in the top menu.")
    @Description("The customer moved the mouse over the Computer button in the top menu.")
    @Severity(SeverityLevel.CRITICAL)
    public void hoverComputerElement(){
        dashboardPage.computerHover();
        BaseDriver.threadWait(3);
    }

    @Test(priority = 8, description = "The customer clicks on the first option, Desktops.")
    @Description("The customer clicks on the first option, Desktops.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickDesktopsBtn(){
        dashboardPage.desktopsBttn();
        BaseDriver.threadWait(2);
    }

    @Test(priority = 9, description = "The customer confirms that they have gone to the Desktop page.")
    @Description("The customer confirms that they have gone to the Desktop page.")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyTextDesktop(){
        desktopspage.verifyDesktopsText();
        BaseDriver.threadWait(2);
    }

    @Test(priority =10, description = "Click the Build Your Own Computer button.")
    @Description("Click the Build Your Own Computer button.")
    @Severity(SeverityLevel.CRITICAL)
    public void buildYourOwnComputerBtns(){
        desktopspage.clickElements();
        BaseDriver.threadWait(2);

    }

    @Test(priority = 11, description = "")
    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    public void ramSelected(){
        buildYourOwnComputerPage.ramSelect("3");
        BaseDriver.threadWait(2);

    }

    @Test(priority = 12, description = "")
    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    public void hddSelected(){
        buildYourOwnComputerPage.hddSelectButton();
        BaseDriver.threadWait(2);
    }
    @Test(priority = 13, description = "")
    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    public void addToCartButton(){
        buildYourOwnComputerPage.clickAddToCart();
        BaseDriver.threadWait(2);
    }

    @Test(priority = 14, description = "")
    @Description("")
    @Severity(SeverityLevel.CRITICAL)
    public void addToCartText(){
        BaseDriver.threadWait(1);
        buildYourOwnComputerPage.verifyAddToCart();
        BaseDriver.threadWait(2);
    }




}
