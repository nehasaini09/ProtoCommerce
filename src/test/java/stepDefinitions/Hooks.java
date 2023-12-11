package stepDefinitions;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

	public class Hooks {
	
		@Before
	    public void setUp() throws IOException, InterruptedException
	    {
	    	DriverFactory.initializeBrowser();
	    }
	    
		@After
		public void tearDown(Scenario scenario)
		{
		   DriverFactory.teardown();
		   String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot)DriverFactory.driver).getScreenshotAs(OutputType.BYTES);
			//scenario.attach(sourcePath, "image/png", screenshotName);
		
		}
		

	}


