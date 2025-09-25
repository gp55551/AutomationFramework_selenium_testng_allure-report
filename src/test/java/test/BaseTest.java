package test;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import page.BasePage;
import util.LoggerLoad;
import util.driver.DriverFactory;

import static util.PropertyFileReader.getProperty;
import static util.driver.DriverHolder.getDriver;
import static util.driver.DriverHolder.setDriver;

public class BaseTest {

    @BeforeMethod
    public void setup(ITestResult result) {
        LoggerLoad.info("===========[ Stating Browser ]===========");
        setDriver(DriverFactory.getNewDriverInstance(getProperty("browser")));
        getDriver().manage().window().maximize();
        LoggerLoad.info("===========[ Navigating to Application ]===========");
        getDriver().get(getProperty("application_url"));
        BasePage.clickContinueShopping(getDriver());
    }

    @AfterMethod
    public void teardown(ITestResult result) {
        if (getDriver() != null) {
            getDriver().quit();
            LoggerLoad.info("===========[ Quiting Browser ]===========");
        }
    }
}