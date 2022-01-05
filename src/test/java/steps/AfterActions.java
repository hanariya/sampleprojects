package steps;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utilities.SeleniumDriver;

public class AfterActions {

    @After
    public static void tearDown(Scenario scenario) {
    	
    	WebDriver driver=SeleniumDriver.getDriver();
    	System.out.println(scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.attach(screenshotBytes, "image/png", "ScreenShot For the failure");
         }
    SeleniumDriver.tearDown();
    }
}
