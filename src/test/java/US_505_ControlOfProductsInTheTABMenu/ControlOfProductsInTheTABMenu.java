package US_505_ControlOfProductsInTheTABMenu;

import Pages.HomePage;
import Pages.RegisterPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.BaseGUITest;

public class ControlOfProductsInTheTABMenu extends BaseGUITest {
    HomePage homePage;
    RegisterPage registerPage;


    private static final Logger LOGGER = LogManager.getLogger(ControlOfProductsInTheTABMenu.class);

    @BeforeClass
    public void  setupPages(){
        homePage=new HomePage(driver);
        registerPage=new RegisterPage(driver);
    }
    @Test(priority = 1)
    public  void verifyHomePage(){
        homePage.verifyhomePage();
    }
    @Test(priority = 2)
    public  void clickRegisterButton(){
        homePage.clickRegisterButton();
    }
    @Test(priority = 3)
    public  void verifyRegisterPage(){
        registerPage.verifyRegisterPage();
    }
    @Test(priority = 4)
    public  void clickGender(){
        registerPage.selectMaleGender();
    }
    @Test(priority = 5)
    public  void fillFirstName(){
        registerPage.fillFirstName();
    }
    @Test(priority = 6)
    public  void fillLastName(){
        registerPage.fillLastName();
    }
    @Test(priority = 7)
    public  void fillEmail(){
        registerPage.fillEmail();
    }
    @Test(priority = 8)
    public  void fillPassword(){
        registerPage.fillPassword();
    }
    @Test(priority = 9)
    public  void fillConfirmPassword(){
        registerPage.fillConfirmPassword();
    }
    @Test(priority = 10)
    public  void clickRegisterBtn() {
        registerPage.clickRegisterButton();
    }
    @Test(priority = 11)
    public  void verifyCompletedRegister(){
        registerPage.verifyRegisterCompleted();
    }

}
