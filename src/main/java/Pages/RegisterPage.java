package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.ConfigReader;


public class RegisterPage extends BasePage {


    @FindBy(xpath = "//div[@class='page-title']/h1")
    private WebElement registerPageText;

    @FindBy(xpath = "//input[@id='gender-male']")
    private WebElement genderMale;

    @FindBy(xpath = "//input[@id='gender-female']")
    private WebElement genderFemale;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement firstnameInput;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement lastnameInput;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id='Password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    private WebElement confirmPasswordInput;

    @FindBy(xpath = "//button[@id='register-button']")
    private WebElement registerButton;

    @FindBy(xpath = "//div[@class='result']")
    private WebElement successfulCompletionText;


    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void verifyRegisterPage() {
        verifyDisplayed(registerPageText, "Register Page not loaded");
        LOGGER.info("Register page verified successfully");
    }

    public void selectMaleGender() {
        clickElement(genderMale);
        LOGGER.info("Male gender clicked");
    }

    public void selectFemaleGender() {
        clickElement(genderFemale);
        LOGGER.info("Female gender clicked");
    }

    public void fillFirstName() {
        clickElement(firstnameInput);
        sendKeysToElement(firstnameInput, ConfigReader.getProperty("firstname"));
        LOGGER.info("Firstname sent to firstname input");
    }

    public void fillLastName() {
        clickElement(lastnameInput);
        sendKeysToElement(lastnameInput, ConfigReader.getProperty("lastname"));
        LOGGER.info("Lastname sent to lastname input");
    }

    public void fillEmail() {
        clickElement(emailInput);
        sendKeysToElement(emailInput, ConfigReader.getProperty("email"));
        LOGGER.info("Email sent to email input");
    }

    public void fillPassword() {
        clickElement(passwordInput);
        sendKeysToElement(passwordInput, ConfigReader.getProperty("password"));
        LOGGER.info("Password sent to password input");
    }

    public void fillConfirmPassword() {
        clickElement(confirmPasswordInput);
        sendKeysToElement(confirmPasswordInput, ConfigReader.getProperty("password"));
        LOGGER.info("Password sent to ConfirmPassword input");
    }

    public void clickRegisterButton() {
        clickElement(registerButton);
        LOGGER.info("Register Button Clicked");
    }

    public void verifyRegisterCompleted() {
        verifyDisplayed(successfulCompletionText, "Register process not completed");
        LOGGER.info("Register process successfully completed. ");
    }
}
