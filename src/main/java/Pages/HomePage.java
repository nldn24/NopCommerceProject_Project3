package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage extends BasePage {

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

    @FindBy(xpath = "//a[@href='/desktops'][1]")
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

    @FindBy(xpath = "//ul[@class='top-menu notmobile']")
    private WebElement tabMenu;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li")
    private List<WebElement> tabMenuElements;

    @FindBy(xpath = "//h1[text()='Computers']")
    private WebElement computerText;

    @FindBy(xpath= "(//*[text()='Electronics'])[2]")
    private WebElement electronicsText;

    @FindBy(xpath = "(//*[text()='Apparel'])[2]")
    private WebElement apparelText;

    @FindBy(xpath = "(//*[text()='Digital downloads'])[2]")
    private WebElement digitalDownloadsText;

    @FindBy (xpath = "(//*[text()='Books'])[2]")
    private WebElement booksText;

    @FindBy(xpath = "(//*[text()='Jewelry'])[2]")
    private WebElement jewelryText;

    @FindBy(xpath = "(//*[text()='Gift Cards'])[2]")
    private WebElement giftCardsText;

    @FindBy(xpath = "(//*[text()='Desktops'])[2]")
    private WebElement desktopsText;

    @FindBy(xpath = "(//*[text()='Notebooks'])[2]")
    private WebElement noteBooksText;

    @FindBy(xpath = "//h1[text()='Software']")
    private WebElement softwareText;

    @FindBy(xpath = "(//*[text()='Camera & photo'])[2]")
    private WebElement cameraPhotoText;

    @FindBy(xpath = "(//*[text()='Cell phones'])[2]")
    private WebElement cellPhonesText;

    @FindBy(xpath = "(//*[text()='Others'])[2]")
    private WebElement othersText;

    @FindBy(xpath = "//h1[text()='Shoes']")
    private WebElement shoesText;

 @FindBy(xpath = "(//*[text()='Clothing'])[2]")
    private WebElement clothingText;

 @FindBy(xpath = "(//*[text()='Accessories'])[2]")
    private WebElement accessoriesText;





    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyHomePage() {

        verifyDisplayed(verifyHomePageText, "HomePage not loaded");
    }

    public void clickRegisterButton() {
        clickElement(homePageregisterButton);
        LOGGER.info("Register Button Clicked");
    }

    public void clickLoginButton() {
        clickElement(loginButton);
        LOGGER.info("CLicked login button");
    }

    public void verifyTabMenu() {
        verifyDisplayed((WebElement) tabMenu, "Tab Menu is not visible");
        LOGGER.info("Tab Menu is visible");
    }
    public void checkTabMenuElements(){
        List <String> tabElementsname = Arrays.asList("Computers","Electronics","Apparel","Digital downloads","Books","Jewelry","Gift Cards");
                checkList(tabMenuElements,tabElementsname);
                LOGGER.info("Elements are listed");
    }

    public void verifyComputerTabClickable(){
        hoverOver(computersBtn);
        clickElement(computersBtn);
        verifyDisplayed(computerText, "Computer tab is not clickable");
        LOGGER.info("Computer Tab is clickable");
    }
    public void verifyElectronicsTabClickable(){
        hoverOver(electronicsButton);
        clickElement(electronicsButton);
        verifyDisplayed(electronicsText, "Electronics tab is not clickable");
        LOGGER.info("Electronics tab is clickable");
    }
    public void verifyApparelTabClickable(){
        hoverOver(apparelButton);
        clickElement(apparelButton);
        verifyDisplayed(apparelText, "Apparel tab is not clickable");
        LOGGER.info("Apparel tab is clickable");
    }
    public void verifyDigitalDownloadsClickable(){
        hoverOver(digitalDownloadsButton);
        clickElement(digitalDownloadsButton);
        verifyDisplayed(digitalDownloadsText, "Digital downloads tab is not clickable");
        LOGGER.info("Digital downloads tab is clickable");
    }

    public void verifyBookTabClickable(){
        hoverOver(booksButton);
        clickElement(booksButton);
        verifyDisplayed(booksText," Books tab is not clickable");
        LOGGER.info("Books tab is clickable");
    }
    public void verifyJewelryTabClickable(){
        hoverOver(JewelryButton);
        clickElement(JewelryButton);
        verifyDisplayed(jewelryText, "Jewelry tab is not clickable");
        LOGGER.info("Jewelry tab is clickable");
    }
    public void verifyGiftCardsClickable(){
        hoverOver(giftCardsButton);
        clickElement(giftCardsButton);
        verifyDisplayed(giftCardsText, "Gift Cards text is clickable");
        LOGGER.info("Gift Cards tab is clickable");
    }
    public void verifyDesktopsClickable(){
        hoverOver(computersBtn);
        clickElement(desktopsSubButton);
        verifyDisplayed(desktopsText, "Desktops tab is not clickable");
        LOGGER.info("Desktops tab is clickable");
    }
    public void verifyNotebooksClickable(){
        hoverOver(computersBtn);
        clickElement(notebooksSubButton);
        verifyDisplayed(noteBooksText, "Notebooks tab is not clickable" );
        LOGGER.info("Notebooks tab is clickable");
    }
    public void  verifySoftwareClickable(){
        hoverOver(computersBtn);
        clickElement(softwareSubButton);
        verifyDisplayed(softwareText, "Software tab is not clickable");
        LOGGER.info("Software tab is clickable");
    }
    public void verifyCameraPhotoClickable(){
        hoverOver(electronicsButton);
        clickElement(cameraPhotoSubButton);
        verifyDisplayed(cameraPhotoText, "Camera & Photo tab is not clickable");
        LOGGER.info("Camera & Photo tab is clickable");
    }
    public void verifyCellPhonesClickable(){
        hoverOver(electronicsButton);
        clickElement(cellPhoneSubButton);
        verifyDisplayed(cellPhonesText, " Cell Phones tab is not clickable");
        LOGGER.info("Cell phones tab is clickable");
    }
    public void verifyOthersClickable(){
        hoverOver(electronicsButton);
        clickElement(othersSubButton);
        verifyDisplayed(othersText, " Others tab is not clickable");
        LOGGER.info("Others tab is clickable");
    }
    public void verifyShoesClickable(){
        hoverOver(apparelButton);
        clickElement(shoeSubButton);
        verifyDisplayed(shoesText, "Shoes tab is not clickable");
        LOGGER.info("Shoes tab is clickable");
    }
    public void verifyClothingClickable(){
        hoverOver(apparelButton);
        clickElement(clothingSubButton);
        verifyDisplayed(clothingText, "Clothing tab is not clickable");
        LOGGER.info(" Clothing tab is clickable");
    }
    public void verifyAccessoriesClickable(){
        hoverOver(apparelButton);
        clickElement(accessoriesSubButton);
        verifyDisplayed(accessoriesText, "Accessories tab is not clickable");
        LOGGER.info("Accessories tab is clickable");
    }







}


