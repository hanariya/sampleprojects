package steps;

import io.cucumber.java.Before;
import utilities.SeleniumDriver;

public class BeforeActions  {

	@Before
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	System.out.println("Before");
       SeleniumDriver.setUpDriver();
    }
}

