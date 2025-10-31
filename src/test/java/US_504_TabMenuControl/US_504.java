package US_504_TabMenuControl;

import Pages.HomePage;
import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utility.BaseDriver;
import utility.BaseGUITest;

import javax.swing.*;
import java.util.List;

public class US_504 extends BaseGUITest {

    HomePage homePage;
    private static final Logger LOGGER = LogManager.getLogger(US_504.class);


    @Test(priority = 1, groups = {"UI Testing, Tab Menu"}, description = "Verify visibility of Tab Menu and list its elements")
    @Description("Verify that Tab Menu is visible")
    @Severity(SeverityLevel.NORMAL)
    public void verifyTabMenuVisibility() {
        homePage = new HomePage(driver);
        homePage.verifyTabMenu();
        homePage.checkTabMenuElements();
        LOGGER.info("Tab Menu is visible and elements are listed");
        BaseDriver.threadWait(3);
    }

    @Test(priority = 2, groups = {"UI Testing, Tab Menu"}, description = "Verify all Tab Menu elements are clickable")
    @Description("Verify Tab Menu elements are clickable")
    @Severity(SeverityLevel.BLOCKER)
    public void verifyTabMenuElementsAreClickable(){
        homePage = new HomePage(driver);
        homePage.verifyComputerTabClickable();
        homePage.verifyElectronicsTabClickable();
        homePage.verifyApparelTabClickable();
        homePage.verifyDigitalDownloadsClickable();
        homePage.verifyBookTabClickable();
        homePage.verifyJewelryTabClickable();
        homePage.verifyGiftCardsClickable();
        BaseDriver.threadWait(3);
        LOGGER.info("Tab Menu elements are clickable");
    }

    @Test(priority = 3, groups = {"UI Testing, Tab Menu"},description = "Verify Tab Menu's subtabs are clickable")
    @Description("Verify Tab Menu's sub tabs are clickable")
    @Severity(SeverityLevel.NORMAL)
    public void verifyTabMenuSubTabsAreClickable(){
        homePage = new HomePage(driver);
        homePage.verifyDesktopsClickable();
        homePage.verifyNotebooksClickable();
        homePage.verifySoftwareClickable();
        homePage.verifyCameraPhotoClickable();
        homePage.verifyCellPhonesClickable();
        homePage.verifyOthersClickable();
        homePage.verifyShoesClickable();
        homePage.verifyClothingClickable();
        homePage.verifyAccessoriesClickable();
        BaseDriver.threadWait(3);
        LOGGER.info("Tab Menu's subtabs are clickable");
    }
    @Attachment(value = "Adim sayisi", type = "text/plain")
    public String step(String message) {
        return message;
    }
}



