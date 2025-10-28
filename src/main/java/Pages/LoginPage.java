package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//div[@class='page-title']/h1")
    private WebElement loginPageVerifyText;

    @FindBy(id= "Email")
    private WebElement emailInput;

    @FindBy(id = "Password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")      //My account button ile
    private WebElement homePageVerify;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    private WebElement errorMessage;


    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void emailInput(String email) {
        wait.until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.clear();
        emailInput.sendKeys(email);

    }
      public void passwordInput(String password) {
          wait.until(ExpectedConditions.visibilityOf(passwordInput));
          passwordInput.clear();
          passwordInput.sendKeys(password);


      }

      public void clickLoginBtn(){
        clickElement(loginButton);
      }
    public void fillLoginMask(String email,String password) {
        wait.until(ExpectedConditions.visibilityOf(emailInput));
        emailInput.clear();
        emailInput.sendKeys(email);

        wait.until(ExpectedConditions.visibilityOf(passwordInput));
        passwordInput.clear();
        passwordInput.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

    }
}
