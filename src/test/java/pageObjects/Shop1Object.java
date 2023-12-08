package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import controller.Controller;
import driverFactory.DriverFactory;

public class Shop1Object extends DriverFactory{
	
	
	
	@FindBy(xpath="//a[text()='Shop']")
	private WebElement shopBtn;
	
	Controller control = new Controller();
	
	public void Shop1Object() {
		PageFactory.initElements(driver,this);
	}
	
	public void validatingShopBtn() {
		control.click(driver, shopBtn);
	}
	
	public void verifyHomePage() {
		String title = driver.getTitle();
		Assert.assertEquals("ProtoCommerce", title);
		System.out.println("User is on Home page"+title);
		
	}

}
