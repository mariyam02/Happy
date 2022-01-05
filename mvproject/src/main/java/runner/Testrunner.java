package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Saira Maryam\\HRO\\Eclipse Testing\\mvproject\\src\\main\\java\\com\\qa\\features\\crm.feature",
		glue = {"com/qa/stepdefintions"},
				format={"pretty","html:testMyreport","json:target/Destination/cucumber.json"},
		dryRun =false,//verifies if all the features are covered, mention true and verify and then change to false
		monochrome = true, //to mention in normal language(removes all 32s etc.etc.
		strict=true //checks if all are mapped properly -if anything left to define the step defintion
		)

public class Testrunner {

}
