package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="com.resources/features/AmazonSigninPage.feature",
		glue= {"stepdefinitions","Hooks"},
		dryRun=false,
		monochrome=true,
		tags= "@run1",
		plugin= {"pretty","html:Reports/htmlreports"})
public class firsttestrunner {

}
