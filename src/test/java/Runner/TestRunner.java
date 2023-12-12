package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/features/Shop/shop1.feature",
glue="stepDefinitions",monochrome=true,plugin= {"html:target/cucumber.html",
		"json:target/cucumber.json"})
		
		//tags= "@OffersPage")

public class TestRunner extends AbstractTestNGCucumberTests{

	@DataProvider(parallel=false)
	public Object[][] scenarios(){
		return super.scenarios();
		
	}
}