package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static util.CommonMethods.*;

public class HomePage extends BasePage {

    private final By logo = By.id("nav-logo-sprites");
    private final By searchBox = By.id("twotabsearchtextbox");
    private final By searchButton = By.id("nav-search-submit-button");
    private final By firstSearchResultName = By.xpath("(//*[text()='Results']/following::a/h2/span)[1]");
    private final By mxPlayerLink = By.xpath("//a[text()='MX Player']");
    private final By helloSignInLink = By.xpath("//*[text()='Hello, sign in']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("verify Home Page")
    public HomePage verifyHomePage()
    {
        verifyElementDisplayed(driver, logo);
        return this;
    }

    @Step("search Product")
    public HomePage searchProduct(String product)
    {
        sendKeys(driver, searchBox, product);
        click(driver, searchButton);
        return this;
    }

    @Step("verify First Link")
    public HomePage verifyFirstLink(String product)
    {
        waitUntilElementVisible(firstSearchResultName);
        Assert.assertTrue(driver.findElement(firstSearchResultName).getText().contains(product));
        return this;
    }

    @Step("verify MX Player link ")
    public HomePage verifyMXPlayerLink()
    {
        verifyElementDisplayed(driver, mxPlayerLink);
        return this;
    }

    @Step("click MX Player link ")
    public MXPlayerPage clickMXPlayerLink()
    {
        click(driver, mxPlayerLink);
        return new MXPlayerPage(driver);
    }

    @Step("click Sign In Link")
    public SignInPage clickSignInLink()
    {
        click(driver,helloSignInLink);
        return new SignInPage(driver);
    }
}