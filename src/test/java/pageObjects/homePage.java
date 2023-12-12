package pageObjects;

import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import controller.Controller;
import driverFactory.DriverFactory;

public class homePage extends DriverFactory{
	Controller control = new Controller();
	
	//Gender
		@FindBy (xpath="//select[@id='exampleFormControlSelect1']")WebElement genderDropdown;
		@FindBy (xpath="//input[@id='inlineRadio1']")WebElement empStatus_Student;
		@FindBy (xpath="//input[@id='inlineRadio2']")WebElement empStatus_Employed;
		@FindBy (xpath="//text()='Date of Birth']")WebElement textAboveDatebox;
		
		public homePage() {
			PageFactory.initElements(driver,this);
		}
		public void verifyLink(String url) {
			try {
				URL link = new URL(url);
				HttpURLConnection httpURLConnection = (HttpURLConnection) link.openConnection();
				httpURLConnection.setConnectTimeout(3000); // Set connection timeout to 3 seconds
				httpURLConnection.connect();


				if (httpURLConnection.getResponseCode() == 200) {
					System.out.println(url + " - " + httpURLConnection.getResponseMessage());
				} else {
					System.out.println(url + " - " + httpURLConnection.getResponseMessage() + " - " + "is a broken link");
				}
			} catch (Exception e) {
				System.out.println(url + " - " + "is a broken link");
			}
		}
		
		public void verifyHomePage() {
			String title = driver.getTitle();
			Assert.assertEquals("ProtoCommerce", title);
			System.out.println("User is on Home page"+title);
			
			
		}

}
