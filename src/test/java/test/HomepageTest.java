package test;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;

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

    @Test(description = "Verify the title of the application")
    @Severity(NORMAL)
    @Description("Verify the title of the application")
    @Story("As a user I should be able to verify title of the application")
    public void verifyTitle() {
        HomePage homePage = new HomePage(getDriver());
        Assert.assertEquals(getDriver().getTitle(),"Online Shopping site in India: Shop Online for Mobiles, Books, " +
                "Watches, Shoes and More - Amazon.in");

    }

    @Test(description = "Verify the language link of homepage")
    @Severity(NORMAL)
    @Description("Verify the language link of homepage")
    @Story("As a user I should be able to verify the language link of homepage")
    public void verifyHomepageLanguageLink() {
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyLanguageLink();
    }
}