package casestudy_batchrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="casestudy_Feature",glue="casestudy_stepdef",tags= {"@search"},plugin= {"pretty","json:target/cucumber-json-report.json"})
public class casestudy_testRunner {
	

}
