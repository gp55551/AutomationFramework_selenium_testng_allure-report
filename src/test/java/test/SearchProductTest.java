package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.HomePage;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.qameta.allure.SeverityLevel.NORMAL;
import static util.driver.DriverHolder.getDriver;

public class SearchProductTest extends BaseTest {

    @Test(description = "Search Product and Verify the first link")
    @Severity(NORMAL)
    @Description("Search Product and Verify the first link")
    @Story("As a user I should be able to Search Product and Verify the first link")
    public void searchProductAndVerifyFirstLink() {
        HomePage homePage = new HomePage(getDriver());
        homePage.searchProduct("iPhone 15");
        homePage.verifyFirstLink("iPhone 15");
    }
}