package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.HomePage;

import static io.qameta.allure.SeverityLevel.CRITICAL;
import static io.qameta.allure.SeverityLevel.NORMAL;
import static util.driver.DriverHolder.getDriver;

public class SignInPageTest extends BaseTest {

    @Test(priority = 1, description = "verify Sign In Page")
    @Severity(NORMAL)
    @Description("verify Sign In Page")
    @Story("As a user I should be able to verify sigin homepage")
    public void verifySignInPage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .clickSignInLink()
                .verifySignInHomepage();
    }

    @Test(priority = 2, description = "Verify the homepage of the application")
    @Severity(NORMAL)
    @Description("Verify the homepage of the application")
    @Story("As a user I should be able to verify sign in fields")
    public void verifySignInFields() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .clickSignInLink()
                .verifyFields();
    }
}