package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {

    @FindBy(xpath = "//div[@class='header-links']/ul/li[1]/a")
    private WebElement MyAccountButton;

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

    @FindBy(xpath = "//a[@class='ico-login']")
    private WebElement loginButton;


    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public void verifyMyAccount() {
        verifyDisplayed(MyAccountButton, "My account button is not visibled");
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }


    public void computerHover() {
        hoverOver(computersBtn);
    }

    public void desktopsBttn() {
        clickElement(desktopsSubButton);
    }
}
