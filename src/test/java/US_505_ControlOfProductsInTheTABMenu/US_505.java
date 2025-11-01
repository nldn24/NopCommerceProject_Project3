package US_505_ControlOfProductsInTheTABMenu;

import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import utility.BaseGUITest;

import java.util.List;

public class US_505 extends BaseGUITest {
    @Test(priority = 1,groups = {"UITesting,Search,TAB Menu,Regression"},
            description = "Verify search functionality with products from config file")
    @Description("Verify search functionality")
    @Severity(SeverityLevel.TRIVIAL)
    public void verifySearchFunctionality() {
        //1-ConfigReader'dan ürün listesini al
        List<String> products = searchPage.getProductsFromConfig();

        //2-Arama işlemini gerçekleştir ve doğrula
        searchPage.searchAndVerifyProducts(products);
    }
    @Attachment(value = "Adim sayisi", type = "text/plain")
    public String step(String message) {
        return message;
    }
}
