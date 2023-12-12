package driverFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ConfigReader;

public class DriverFactory {
	
public static WebDriver driver;
static ConfigReader configreader =new ConfigReader();
public static String url=configreader.getAppUrl();
public static String browserName=configreader.getbrowser();
	
	public static void initializeBrowser() throws InterruptedException
	{
		if(browserName.equalsIgnoreCase("chrome")){
				driver = new ChromeDriver();
		 }
		else if(browserName.equalsIgnoreCase("firefox")){
				driver = new FirefoxDriver();
	     }
	    //url will open
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			
	}
		public static void teardown(){
		
			driver.close();
		}

}
