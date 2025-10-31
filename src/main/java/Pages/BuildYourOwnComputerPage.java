package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends BasePage {

    @FindBy(id = "product_attribute_2")
    private WebElement gb2Select;

    @FindBy(xpath = "//label[@for='product_attribute_3_6']")
    private WebElement hddSelect;

    @FindBy(xpath = "//div[@class='overview']")
    private WebElement addToCartBtn;

    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    private WebElement addToCartVerify;


    public void ramSelect(String value2) {
        selected(gb2Select, value2);
    }

    public void hddSelectButton() {
        clickElement(hddSelect);
    }

    public void clickAddToCart(){
        clickElement(addToCartBtn);
    }

    public void verifyAddToCart(){
        verifyDisplayed(addToCartVerify,"The “Added to cart” message did not appear.");
    }




    public BuildYourOwnComputerPage(WebDriver driver) {
        super(driver);
    }




}
