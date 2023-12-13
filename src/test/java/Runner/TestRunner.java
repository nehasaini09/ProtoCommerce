package Runner;
@CucumberOptions(features="src/test/resources/features/", //home2/homePageLaunch.feature
glue="stepDefinitions",monochrome=true,plugin= {"html:target/cucumber.html",
		"json:target/cucumber.json"})
		
public class TestRunner extends AbstractTestNGCucumberTests{

public class TestRunner  {

	
}

