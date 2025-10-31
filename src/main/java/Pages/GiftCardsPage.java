package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.ConfigReader;

public class GiftCardsPage extends BasePage {

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[7]")
    private WebElement giftCardsButton;

    @FindBy(xpath = "//button[contains(@onclick,'/addproducttocart/catalog/46/1')]")
    private WebElement addToCardButton;

    @FindBy(xpath = "//input[@id='giftcard_46_RecipientName']")
    private WebElement fillRecipientsName;

    @FindBy(xpath = "//input[@id='giftcard_46_SenderName']")
    private WebElement fillYourName;

    @FindBy(xpath = "//textarea[@id='giftcard_46_Message']")
    private WebElement fillMessage;

    @FindBy(xpath = "//button[@id='add-to-cart-button-46']")
    private WebElement clickAddToCardBtn;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
    private WebElement clickShoppingCard;

    @FindBy(xpath = "//a[@class='product-name']")
    private WebElement verifyProductName;

    public GiftCardsPage(WebDriver driver) { super(driver);
    }

    public void verifyGiftsCards(){
        verifyDisplayed(giftCardsButton,"Gift Cards not loaded");
        LOGGER.info("Gift cards button verified.");
    }
    public void clickGiftCards() {
        clickElement(giftCardsButton);
        LOGGER.info("Gift cards button clicked");
    }
    public void clickAddToCard() {
        clickElement(addToCardButton);
        LOGGER.info("Add to card button clicked");
    }

    public void fillRecipientsName() {
        sendKeysToElement(fillRecipientsName, ConfigReader.getProperty("recipientsname"));
        LOGGER.info("Recipient's name sent to recipient's name input");
    }
    public void fillYourName() {
        sendKeysToElement(fillYourName, ConfigReader.getProperty("yourname"));
        LOGGER.info("Your name sent to your name input");
    }
    public void fillMessage() {
        sendKeysToElement(fillMessage, ConfigReader.getProperty("message"));
        LOGGER.info("Message sent to message input");
    }
    public void clickAddToCardBtn() {
        clickElement(clickAddToCardBtn);
        LOGGER.info("Add to card button clicked");
    }
    public void clickShoppingCard() {
        clickElement(clickShoppingCard);
        LOGGER.info("Shopping Card clicked");
    }
    public void verifyProductName(){
        verifyDisplayed(verifyProductName,"Product name not loaded");
        LOGGER.info("Product name verified.");
    }

}
