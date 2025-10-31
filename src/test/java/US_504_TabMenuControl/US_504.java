package US_504_TabMenuControl;

import Pages.HomePage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import utility.BaseGUITest;

import javax.swing.*;

public class US_504 extends BaseGUITest {

    HomePage homePage;
    private static final Logger LOGGER = LogManager.getLogger(US_504.class);


    @Test(priority = 1, groups = {"UI Testing, Tab Menu"}, description = "Verify visibility of Tab Menu and list its elements")
    @Description("Verify that Tab Menu is visible")
    @Severity(SeverityLevel.NORMAL)
    public void verifyTabMenu() {
        homePage.verifyTabMenu();







    }
}



