package runner;



import org.testng.annotations.BeforeClass;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "json:target/RunCuke/cucumber.json", "pretty",
		"html:target/RunCuke/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, 
features = "src/test/resources/features", 
glue = "steps",
publish=true)

public class RunCuke extends AbstractTestNGCucumberTests {
	@BeforeClass
	public static void setup() {

	}

}
