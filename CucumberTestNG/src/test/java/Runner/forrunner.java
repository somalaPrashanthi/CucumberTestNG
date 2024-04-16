package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(	
		features = {"C:\\Users\\Prashanthi\\Documents\\workspace-spring-tool-suite-4-4.21.0.RELEASE\\CucumberTestNG\\src\\test\\resources\\Forms\\TestNg.feature"},
		
		glue = {"Steps"}
		
	)

public class forrunner extends AbstractTestNGCucumberTests {

}
