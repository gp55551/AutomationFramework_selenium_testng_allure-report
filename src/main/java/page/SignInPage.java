package page;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static util.CommonMethods.verifyElementDisplayed;

public class SignInPage extends BasePage {

    private final By signInHeader = By.xpath("//*[contains(text(),'Sign in or create account')]");
    private final By enterEmailField = By.id("ap_email_login");
    private final By continueButton = By.id("continue");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @Step("verify Sign In Homepage")
    public SignInPage verifySignInHomepage() {
        verifyElementDisplayed(driver, signInHeader);
        return this;
    }

    @Step("verify Sign In Fields")
    public SignInPage verifyFields() {
        verifyElementDisplayed(driver, enterEmailField);
        verifyElementDisplayed(driver, continueButton);
        return this;
    }
}