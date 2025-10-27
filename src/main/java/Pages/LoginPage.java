package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//div[@class='page-title']/h1")
    private WebElement loginPageVerifyText;

    @FindBy(xpath = "//input[@class='email input-validation-error']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@class='password valid']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")      //My account button ile
    private WebElement homePageVerify;


    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
