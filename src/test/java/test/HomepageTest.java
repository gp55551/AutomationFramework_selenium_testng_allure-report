package test;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import page.HomePage;
import util.LoggerLoad;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.qameta.allure.SeverityLevel.NORMAL;
import static util.driver.DriverHolder.getDriver;

public class HomepageTest extends BaseTest {

    @Test(description = "Verify the homepage of the application")
    @Severity(NORMAL)
    @Description("Verify the homepage of the application")
    @Story("As a user I should be able to verify homepage of the application")
    public void verifyHomePage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage();
    }
}