package StepDefinition;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(
		plugin= {"pretty","html:target/HtmlReports1.html"},
		features="C:\\Users\\vinay.golla\\eclipse-workspace\\Newprct\\Features\\Srinv.feature"
		,glue= {"Execution"},tags="@SIT or @Regression or @UAT")
// (features="{f1,f2}")
public class Runner1 {

}

//@RunWith(Cucumber .class)
//@CucumberOptions(
//plugin = {"json:Srinivas/cucumber.json", "html:target2/index.html"},
//features= {"C:\\Users\\Training1\\eclipse-workspace\\SampleMaven\\Features\\payments.feature" },
//glue= {"stepDefinition"},
//tags= "@Smoke")
//public class Runner1 {
//
//}
