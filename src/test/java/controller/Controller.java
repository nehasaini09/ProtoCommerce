package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import controllerInterface.ControllerInterface;
import driverFactory.DriverFactory;

public class Controller extends DriverFactory implements ControllerInterface {
		
		
		Actions action=new Actions(driver);
		Select select;
		

		public void click(WebDriver driver, WebElement element) {
			action.moveToElement(element).click().build().perform();
			
			
		}


		public String getTitle(WebDriver driver) {
		return driver.getTitle();
			
		}

	}


