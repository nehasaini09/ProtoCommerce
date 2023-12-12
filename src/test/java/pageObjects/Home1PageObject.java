package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home1PageObject {
	
WebDriver ldriver;
	
	public Home1PageObject(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	@FindBy (xpath = "//a[@href='/angularpractice']") WebElement HomeButton;
	@FindBy (name ="name") WebElement NameTextBox;
	@FindBy (name="email") WebElement EmailTextBox;
	@FindBy (id ="exampleInputPassword1") WebElement PasswordTextBox;
	@FindBy (id = "exampleCheck1") WebElement CheckBox;
	@FindBy (xpath ="//input[@class='btn btn-success']") WebElement SubmitButton;
	
      

}
