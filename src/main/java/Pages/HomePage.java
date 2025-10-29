package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//div[@class='topic-block-title']/h2")
    private WebElement verifyHomePageText;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")
    private WebElement homePageregisterButton;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[2]/a")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='header-links']/ul/li[2]/a")
    private WebElement logoutButton;

    @FindBy(xpath = "//input[@id='small-searchterms']")
    private WebElement searchBox;

    @FindBy(xpath = "//button[@class='button-1 search-box-button']")
    private WebElement searchButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/a")
    private WebElement computersBtn;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[1]/a")
    private WebElement desktopsSubButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[2]/a")
    private WebElement notebooksSubButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]/ul/li[3]/a")
    private WebElement softwareSubButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/a")
    private WebElement electronicsButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[1]/a")
    private WebElement cameraPhotoSubButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[2]/a")
    private WebElement cellPhoneSubButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[2]/ul/li[3]/a")
    private WebElement othersSubButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/a")
    private WebElement apparelButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/ul/li[1]/a")
    private WebElement shoeSubButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/ul/li[2]/a")
    private WebElement clothingSubButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[3]/ul/li[3]/a")
    private WebElement accessoriesSubButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[4]/a")
    private WebElement digitalDownloadsButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[5]/a")
    private WebElement booksButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[6]/a")
    private WebElement JewelryButton;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[7]/a")
    private WebElement giftCardsButton;


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyHomePage(){

        verifyDisplayed(verifyHomePageText,"HomePage not loaded");
    }

    public void clickRegisterButton(){
        clickElement(homePageregisterButton);
        LOGGER.info("Register Button Clicked");
    }

}
