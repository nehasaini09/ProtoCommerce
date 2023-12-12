package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features/home2/homePageLaunch.feature",
glue="stepDefinitions",monochrome=true,plugin= {"html:target/cucumber.html",
		"json:target/cucumber.json"})
		
public class TestRunner extends AbstractTestNGCucumberTests{

	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
		
	}
}