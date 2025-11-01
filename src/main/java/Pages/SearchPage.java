package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utility.ConfigReader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SearchPage extends BasePage{
    @FindBy(xpath = "//input[@id='small-searchterms']")
    private WebElement searchInput;

    @FindBy(xpath = "//button[@type='submit' and text()='Search']")
    private WebElement searchButton;

    // Arama sonucundaki ürün başlıkları
    @FindBy(xpath = "//h2[@class='product-title']/a")
    private List<WebElement> searchResults;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    // ConfigReader'dan ürün listesini çek
    public List<String> getProductsFromConfig() {
        List<String> productList = new ArrayList<>();
        for (int i = 1; i <= 6; i++) { // 6 ürün var
            String product =ConfigReader.getProperty("product" + i);
            if (product != null && !product.isEmpty()) {
                productList.add(product);
            }
        }
        LOGGER.info("Ürün listesi config dosyasından çekildi: " + productList);
        return productList;
    }
    // Arama işlemini yap ve sonucu doğrula
    public void searchAndVerifyProducts(List<String> productList) {
        for (String product : productList) {
            try {
                // Arama kutusuna yaz
                searchInput.clear();
                searchInput.sendKeys(product);
                searchButton.click();

                // Sonuçlardaki ürünleri al
                List<String> results = searchResults.stream()
                        .map(WebElement::getText)
                        .collect(Collectors.toList());

                // Aranan ürün sonuçlarda var mı kontrol et
                boolean found = results.stream().anyMatch(r -> r.toLowerCase().contains(product.toLowerCase()));

                if (found) {
                    LOGGER.info(product + "' arama sonucunda bulundu.");
                } else {
                    LOGGER.error(product + "' arama sonucunda bulunamadı!");
                }

                // Sonraki ürün araması için ana sayfaya dön
                driver.navigate().back();

            } catch (Exception e) {
                LOGGER.error("Arama sırasında hata oluştu: " + e.getMessage());
            }
        }
    }





}
