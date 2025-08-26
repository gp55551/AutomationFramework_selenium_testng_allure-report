package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class CommonMethods {

    public static void waitForElementToBeVisible(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitUntilElementClickable(WebDriver driver, By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void click(WebDriver driver, By locator) {
        waitForElementToBeVisible(driver, locator);
        driver.findElement(locator).click();
    }

    public static void sendKeys(WebDriver driver, By locator, String text) {
        waitForElementToBeVisible(driver, locator);
        driver.findElement(locator).sendKeys(text);
    }

    public static void verifyElementDisplayed(WebDriver driver, By locator) {
        waitForElementToBeVisible(driver, locator);
        Assert.assertTrue(driver.findElement(locator).isDisplayed());
    }
}


