package stepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/Features",
		glue= {"stepDefinition"},
		monochrome=true,
		plugin={"json:target/cucumber.json"}
				//plugin={"pretty","html:target/HTMLReports/index.html"}
		)
public class TestRunner {
	
	

}
