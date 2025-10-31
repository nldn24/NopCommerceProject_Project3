package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftCardsPage extends BasePage {

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[7]/a")
    private WebElement giftCardsButton;




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




}
