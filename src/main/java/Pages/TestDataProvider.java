package Pages;
import org.testng.annotations.DataProvider;
import utility.ConfigReader;

public class TestDataProvider {


    @DataProvider(name = "invalidLoginCredentials")
    public Object[][] getInvalidData() {
        return new Object[][]{
                {"admin1@mail.com", "Password123"},
                {"user2@mail.com", "Password123"},
                {"demo3@mail.com", "Password123"},
                {"keciy81655@filipx.com", "wrongpass4"},
                {"keciy81655@filipx.com", "wrongpass5"},
                {"keciy81655@filipx.com", "wrongpass6"},
                // ✅ ConfigReader ile doğru veriler en son
                {ConfigReader.getProperty("email"), ConfigReader.getProperty("password")}

        };
    }}
