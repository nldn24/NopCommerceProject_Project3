package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{


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

    public void verifyRegisterPage(){
        verifyDisplayed(registerPageText,"Register Page not loaded");
        LOGGER.info("Register page verified successfully");
    }
    public void selectMaleGender(){
        clickElement(genderMale);
        LOGGER.info("Male gender clicked");
    }
    public void selectFemaleGender(){
        clickElement(genderFemale);
        LOGGER.info("Female gender clicked");
    }

    public void clickedFirstnameInput(){
        clickElement(firstnameInput);
    }
}
