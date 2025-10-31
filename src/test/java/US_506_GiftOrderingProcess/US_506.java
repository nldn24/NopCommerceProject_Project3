package US_506_GiftOrderingProcess;

import Pages.GiftCardsPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.BaseGUITest;
import utility.ConfigReader;

public class US_506 extends BaseGUITest {

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
    @Test(priority = 6, groups = {"UITesting", "TAB Menu", "Order"}, description = "Verify that Gift Cards page is visible successfully")
    @Description("Verify that Gift Cards page is visible successfully")
    @Severity(SeverityLevel.CRITICAL)
    public  void verifyGiftCardsBtn(){
        giftCardsPage.verifyGiftsCards();
        LOGGER.info("Gift Cards page opened");
    }
    @Test(priority = 7,groups = {"Smoke","Login Test"}, description = "Gift cards button clicked successfully.")
    @Description("Gift cards button clicked successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickGiftCards(){
        giftCardsPage.clickGiftCards();
        LOGGER.info("Gift cards button clicked.");

    }
    @Test(priority = 8,groups = {"Smoke","Login Test"}, description = "Add to Card button clicked successfully.")
    @Description("Add to Card button clicked successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickAddToCard(){
        giftCardsPage.clickAddToCard();
        LOGGER.info("Add to Card button clicked.");
        BaseDriver.threadWait(2);

    }
    @Test(priority = 9, groups = {"Smoke","Registration"}, description = "Recipient's name entered successfully.")
    @Description("Recipient's name entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void fillRecipientsName(){
        giftCardsPage.fillRecipientsName();
        LOGGER.info("Recipient's name entered.");
        BaseDriver.threadWait(2);
    }
    @Test(priority = 10, groups = {"Smoke","Registration"}, description = "Your name entered successfully.")
    @Description("Your name entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void fillYourName(){
        giftCardsPage.fillYourName();
        LOGGER.info("Your name entered.");
        BaseDriver.threadWait(2);
    }
    @Test(priority = 11, groups = {"Smoke","Registration"}, description = "Message entered successfully.")
    @Description("Message entered successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public  void fillMessage(){
        giftCardsPage.fillMessage();
        LOGGER.info("Message entered.");
        BaseDriver.threadWait(2);
    }
    @Test(priority = 12,groups = {"Smoke","Login Test"}, description = "Add to Card button clicked successfully.")
    @Description("Add to Card button clicked successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickAddToCardBtn(){
        giftCardsPage.clickAddToCardBtn();
        LOGGER.info("Add to Card button clicked.");
        BaseDriver.threadWait(2);

    }
    @Test(priority = 13,groups = {"Smoke","Login Test"}, description = "Shopping card clicked successfully.")
    @Description("Shopping card clicked successfully.")
    @Severity(SeverityLevel.CRITICAL)
    public void clickShoppingCard(){
        giftCardsPage.clickShoppingCard();
        LOGGER.info("Shopping Card button clicked.");
        BaseDriver.threadWait(2);
    }
    @Test(priority = 14, groups = {"UITesting", "TAB Menu", "Order"}, description = "Verify that Product name is visible successfully")
    @Description("Verify that Product name is visible successfully")
    @Severity(SeverityLevel.CRITICAL)
    public  void verifyProductName(){
        giftCardsPage.verifyProductName();
        LOGGER.info("Product name visible");
        BaseDriver.threadWait(2);
    }


}
