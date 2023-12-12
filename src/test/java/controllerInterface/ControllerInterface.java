package controllerInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ControllerInterface {
	
	//abstract methods for user actions
	public void click(WebDriver driver,WebElement element);
	public String getTitle(WebDriver driver);

}
