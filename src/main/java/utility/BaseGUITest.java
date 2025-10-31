package utility;

import Pages.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Properties;

public class BaseGUITest {

    protected final Logger LOGGER = LogManager.getLogger(this.getClass());
    public WebDriver driver;
    protected HomePage homePage;

    protected LoginPage loginPage;
    protected RegisterPage registerPage;
    protected DashboardPage dashboardPage;
    protected Desktopspage desktopspage;
    protected GiftCardsPage giftCardsPage;

    protected Properties config;
    protected BuildYourOwnComputerPage buildYourOwnComputerPage;


    @BeforeClass
    public void init(){
        driver  = BaseDriver.driver(ConfigReader.getProperty("baseURL"));
        LOGGER.info("Web sitesi acildi");


        config=new Properties();
         homePage= new HomePage(driver);
        loginPage = new LoginPage(driver);
        registerPage = new RegisterPage(driver);
        dashboardPage = new DashboardPage(driver);
        desktopspage=new Desktopspage(driver);
        buildYourOwnComputerPage=new BuildYourOwnComputerPage(driver);
        giftCardsPage = new GiftCardsPage(driver);

    }

    @AfterClass
    public void quitTest() {
        driver.quit();
        LOGGER.info("Tarayici kapandi");
    }
}
