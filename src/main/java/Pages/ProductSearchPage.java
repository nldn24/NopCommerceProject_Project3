package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.ConfigReader;

public class ProductSearchPage extends BasePage {

    @FindBy(xpath = " //input[@id='small-searchterms']")
    private WebElement clickSearchBox;

    @FindBy(xpath = " //input[@id='small-searchterms']")
    private WebElement sendKeysSearchBox;

    @FindBy(xpath = "//button[@class='button-1 search-box-button']")
    private WebElement clickSearchBtn;

    @FindBy(xpath = "//h2[@class='product-title']")
    private WebElement verifyProductTitle;


    public ProductSearchPage(WebDriver driver) {
        super(driver);
    }
    public void clickSearchBox() {
        clickElement(clickSearchBox);
        LOGGER.info("Search box clicked");
    }
    public void fillSearchBox() {
        sendKeysToElement(sendKeysSearchBox, ConfigReader.getProperty("productname"));
        LOGGER.info("Product name sent to product name input");
    }
    public void clickSearchBtn() {
        clickElement(clickSearchBtn);
        LOGGER.info("Search button clicked");
    }
    public void verifyProductTitle(){
        verifyDisplayed(verifyProductTitle,"Product title not loaded");
        LOGGER.info("Product title verified.");
    }
}
