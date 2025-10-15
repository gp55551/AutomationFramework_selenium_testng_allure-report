package test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import page.HomePage;

import static io.qameta.allure.SeverityLevel.NORMAL;
import static page.MXPlayerPage.Link.*;
import static util.driver.DriverHolder.getDriver;

public class MxPlayerHomepageTest extends BaseTest {

    @Test(priority = 1, description = "verify MX Player Homepage")
    @Severity(NORMAL)
    @Description("verify MX Player Homepage")
    @Story("As a user I should be able to verify MX Player Homepage")
    public void verifyMXPlayerHomepage() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .verifyMXPlayerLink()
                .clickMXPlayerLink()
                .verifyMXPlayerHomepage();
    }

    @Test(priority = 2, description = "verify MX Player Links")
    @Severity(NORMAL)
    @Description("verify MX Player Links")
    @Story("As a user I should be able to verify MX Player Links")
    public void verifyLinks() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePage()
                .verifyMXPlayerLink()
                .clickMXPlayerLink()
                .verifyMXPlayerHomepage()
                .verifyAllLinks(HOME.getLinkTextValue())
                .verifyAllLinks(NEWS_HOT.getLinkTextValue())
                .verifyAllLinks(WEB_SERIES.getLinkTextValue())
                .verifyAllLinks(MOVIES.getLinkTextValue())
                .verifyAllLinks(V_DESI.getLinkTextValue())
                .verifyAllLinks(COMEDY.getLinkTextValue())
                .verifyAllLinks(TAMIL.getLinkTextValue());
    }
}