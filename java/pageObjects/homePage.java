package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {
	
	//Gender
		@FindBy (xpath="//select[@id='exampleFormControlSelect1']")WebElement genderDropdown;
		@FindBy (xpath="//input[@id='inlineRadio1']")WebElement empStatus_Student;
		@FindBy (xpath="//input[@id='inlineRadio2']")WebElement empStatus_Employed;
		@FindBy (xpath="//text()='Date of Birth']")WebElement textAboveDatebox;

}
