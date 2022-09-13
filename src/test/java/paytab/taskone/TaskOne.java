package paytab.taskone;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/taskone.feature",
glue= "stepDefinitions" , plugin= {"html:Report/positiveHtmlReport","junit:Report/positiveJunitReport.xml"}
)
public class TaskOne {

}
