import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags = { "@subtag" }, 
plugin = { "pretty:pretty-report.log", 
		"html:target/html-report",
		"json:target/json-report.json" ,
		//"progress",
	//	"usage",
		"rerun"
		}, 
glue= {"com.def.stepdefs"},
monochrome = true
)
public class TestRunner {
}