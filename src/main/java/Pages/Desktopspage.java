package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Desktopspage extends BasePage {

    @FindBy(xpath = "//div[@class='page-title']/h1")
    private WebElement desktopsVerify;

    @FindBy(xpath = "//h2[@class='product-title']/a")
    private WebElement buildYourOwnComputerBtn;


    public void verifyDesktopsText(){
        verifyDisplayed(desktopsVerify,"Desktops text not visible");
    }

    public void clickElements(){
        clickElement(buildYourOwnComputerBtn);
    }

    public Desktopspage(WebDriver driver) {
        super(driver);
    }

}
