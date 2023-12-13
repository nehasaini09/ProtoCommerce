package hooks;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class AppHooks {
	
WebDriver driver;
	
    @Before
    public void setUp() throws IOException
    {
    	Properties prop= ConfigReader.initializeProperties();
    	driver=DriverFactory.initializeBrowser(prop.getProperty("browser"));
    	driver.get(prop.getProperty("url"));
    }
    
	@After
	public void tearDown()
	{
	   // driver.quit();
	
	}
	

}
