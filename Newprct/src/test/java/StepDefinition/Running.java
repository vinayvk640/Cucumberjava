package StepDefinition;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="C:\\Users\\vinay.golla\\eclipse-workspace\\Newprct\\Features\\Vinay.feature"
,glue= {"Execution"},plugin= {"pretty","html:target/HtmlReports"})
public class Running {

}
