package stepDefinitions;

import java.io.IOException;
import driverFactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

	public class Hooks {
	
		@Before
	    public void setUp() throws IOException, InterruptedException
	    {
	    	DriverFactory.initializeBrowser();
	    }
	    
		@After
		public void tearDown()
		{
		   DriverFactory.teardown();
	  
		}
		

	}
