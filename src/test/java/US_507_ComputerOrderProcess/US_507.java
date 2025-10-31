package US_507_ComputerOrderProcess;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.BaseGUITest;
import utility.ConfigReader;

public class US_507 extends BaseGUITest {

    // ======================== UI TESTING GROUP ========================

    @Test(priority = 1, description = "Open the browser and navigate to the Website.",
            groups = {"UI Testing"})
    @Description("Navigate to Website.")
    @Severity(SeverityLevel.CRITICAL)
    public void navigateToWebsite() {
        homePage.verifyHomePage();
        LOGGER.info(" The customer successfully opened the browser and navigated to the website.");
    }

    @Test(priority = 2, description = "The customer clicks the login button.",
            groups = {"UI Testing"})
    @Description("Click login button")
    @Severity(SeverityLevel.CRITICAL)
    public void clickLoginBtn() {
        homePage.clickLoginButton();
        LOGGER.info(" The customer clicked the Login button on the home page.");

    }

    @Test(priority = 3, description = "The customer enters their email address in the email section.",
            groups = {"UI Testing"})
    @Description("The customer enters their email address in the email section.")
    @Severity(SeverityLevel.CRITICAL)
    public void emailInput() {
        loginPage.emailInput(ConfigReader.getProperty("email"));
        LOGGER.info("The customer entered their email address successfully: " + ConfigReader.getProperty("email"));

    }

    @Test(priority = 4, description = "The customer enters their password in the password field.",
            groups = {"UI Testing"})
    @Description("The customer enters their password in the password field.")
    @Severity(SeverityLevel.CRITICAL)
    public void passwordInput() {
        loginPage.passwordInput(ConfigReader.getProperty("password"));
        LOGGER.info("The customer entered their password successfully.");

    }

    @Test(priority = 5, description = "The customer clicks the login button.",
            groups = {"UI Testing"})
    @Description("The customer clicks the login button.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickLoginButton() {
        loginPage.clickLoginBtn();
        LOGGER.info("The customer clicked the Login button to attempt login.");
    }

    @Test(priority = 6, description = "Entry approved.",
            groups = {"UI Testing"})
    @Description("Entry approved.")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyLogin() {
        dashboardPage.verifyMyAccount();
        LOGGER.info("The customer successfully logged in and verified the 'My Account' section.");

    }

    // ======================== TAB MENU GROUP ========================

    @Test(priority = 7, description = "The customer moved the mouse over the Computer button in the top menu.",
            groups = {"Tab Menu"})
    @Description("The customer moved the mouse over the Computer button in the top menu.")
    @Severity(SeverityLevel.CRITICAL)
    public void hoverComputerElement() {
        dashboardPage.computerHover();
        LOGGER.info("The customer hovered over the 'Computer' button in the top menu.");

    }

    @Test(priority = 8, description = "The customer clicks on the first option, Desktops.",
            groups = {"Tab Menu"})
    @Description("The customer clicks on the first option, Desktops.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickDesktopsBtn() {
        dashboardPage.desktopsBttn();
        LOGGER.info("The customer clicked on the 'Desktops' option under the Computer menu.");

    }

    @Test(priority = 9, description = "The customer confirms that they have gone to the Desktop page.",
            groups = {"Tab Menu"})
    @Description("The customer confirms that they have gone to the Desktop page.")
    @Severity(SeverityLevel.CRITICAL)
    public void verifyTextDesktop() {
        desktopspage.verifyDesktopsText();
        LOGGER.info("The customer verified that they have successfully navigated to the 'Desktops' page.");

    }

    // ======================== ORDER GROUP ========================

    @Test(priority = 10, description = "Click the Build Your Own Computer button.",
            groups = {"Order"})
    @Description("Click the Build Your Own Computer button.")
    @Severity(SeverityLevel.CRITICAL)
    public void buildYourOwnComputerBtns() {
        desktopspage.clickElements();
        LOGGER.info("The customer clicked the 'Build Your Own Computer' product button.");

    }

    @Test(priority = 11, description = "The customer selects a random RAM option.",
            groups = {"Order"})
    @Description("The customer selects a random RAM option.")
    @Severity(SeverityLevel.CRITICAL)
    public void ramSelected() {
        buildYourOwnComputerPage.ramSelect("3");
        LOGGER.info("The customer selected a random RAM option from the dropdown.");

    }

    @Test(priority = 12, description = "The customer selects a random HDD option.",
            groups = {"Order"})
    @Description("The customer selects a random HDD option.")
    @Severity(SeverityLevel.CRITICAL)
    public void hddSelected() {
        buildYourOwnComputerPage.hddSelectButton();
        LOGGER.info("The customer selected a random HDD option successfully.");

    }

    @Test(priority = 13, description = "The customer scrolls down the page to view more options.",
            groups = {"Order"})
    @Description("Scroll down the Build Your Own Computer page.")
    @Severity(SeverityLevel.NORMAL)
    public void scrollDown() {
        buildYourOwnComputerPage.scrollDown();
        LOGGER.info("The customer scrolled down the page to view more options.");
    }

    @Test(priority = 14, description = "The customer selects the Add to cart option.",
            groups = {"Order"})
    @Description("The customer selects the Add to cart option.")
    @Severity(SeverityLevel.CRITICAL)
    public void addToCartButton() {
        buildYourOwnComputerPage.clickAddToCart();
        LOGGER.info("The customer clicked on the 'Add to Cart' button for the selected configuration.");
    }

    @Test(priority = 15, description = "The customer verifies that the product has been added to the cart after selecting the Add to cart option.",
            groups = {"Order"})
    @Description("The customer verifies that the product has been added to the cart after selecting the Add to cart option.")
    @Severity(SeverityLevel.CRITICAL)
    public void addToCartText() {
        buildYourOwnComputerPage.verifyAddToCart();
        LOGGER.info("The customer verified that the product was successfully added to the shopping cart.");

    }
}
