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
	
	@FindBy(xpath="//a[text()='ProtoCommerce Home']")
	private WebElement protoBtn;
	
	@FindBy(css =".btn.btn-primary")
	private WebElement checkoutBtn;
	
	Controller control = new Controller();
	
	public Shop1Object() {
		PageFactory.initElements(driver,this);
	}
	
	public void validatingShopBtn() {
          shopBtn.click();
		}
	
	public void verifyHomePage() {
		String title = driver.getTitle();
		Assert.assertEquals("ProtoCommerce", title);
		System.out.println("User is on Home page"+title);
		
	}
	
	public void verifyShopPage() {
		String title = driver.getTitle();
		Assert.assertEquals("ProtoCommerce", title);
		System.out.println("User is on Shopping page"+title);
	}
	
	public void verifyProtoComm() {
		control.click(driver, protoBtn);
	}

	public void clickOnChkBtn() {
		control.click(driver, checkoutBtn);
	
}
	
	public void verifyCheckoutPage() {
		String title=driver.getTitle();
		Assert.assertEquals("ProtoCommerce", title);
		
	}
	
}
