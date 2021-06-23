package com.automationpractice.base;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject {

	protected WebDriver driver;
	protected Logger log;

	public BasePageObject(WebDriver driver, Logger log) {
		this.driver = driver;
		this.log = log;
	}
	
	//open page with URL
	protected void openURL(String url) {
		driver.get(url);
	}
	
	//find element using locator
	protected WebElement find(By locator) {
		return driver.findElement(locator);
	}
	
	//click on the element when it is visible
	protected void click(By locator) {
		waitForVisibilityOf(locator,10);
		find(locator).click();
	}
	
	//type text into the field
	protected void type(String text,By locator) {
		waitForVisibilityOf(locator,10);
		find(locator).sendKeys(text);
		
	}
	
	
	
	//Explicit Waits
	
	//wait for specified expected condition for given amt of time
	protected void waitFor(ExpectedCondition<WebElement> condition, Integer timeOutInSeconds) {
		timeOutInSeconds = timeOutInSeconds != null ? timeOutInSeconds : 30;
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(condition);
	}
	
	//wait for visibility of the element for specified time
		protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) {
			int attempts = 0;
			while (attempts < 2) {
				try {
					waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
							(timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
					break;
				} catch (StaleElementReferenceException e) {
				}
				attempts++;
			}
		}
	
		// perform mover hover over
		protected void hoverOver(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	
	
	
	
}
