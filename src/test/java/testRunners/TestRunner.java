package testRunners;



//import org.junit.runner.RunWith;
//import io.cucumber.junit.Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = {"stepDefinations"},
		monochrome = true,
		plugin = {"pretty", "html:HtmlReports/report.html",
				"json:JSONReports/report.json",
				},
		tags="@SmokeTest"
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
}
