package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "E:\\Selenium Programs\\CucumberFramework\\src\\test\\resources\\Features\\LogIn.feature"
 ,glue = {"StepDefination"}

 )

public class TestRunner {

}
