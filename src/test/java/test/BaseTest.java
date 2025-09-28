package test;

import org.testng.ITestResult;
import org.testng.annotations.*;
import page.BasePage;
import util.CommonMethods;
import util.LoggerLoad;
import util.driver.DriverFactory;

import static util.PropertyFileReader.getProperty;
import static util.driver.DriverHolder.getDriver;
import static util.driver.DriverHolder.setDriver;

public class BaseTest {

    @BeforeTest
    public void beforeTest() {
        LoggerLoad.info("===========[ Cleanup ]===========");
        CommonMethods.deleteFiles(getProperty("dirPath"));
    }
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
            //CommonMethods.generateAllureReport(getProperty("dirPath"));
            LoggerLoad.info("===========[ Quiting Browser ]===========");
        }
    }
}